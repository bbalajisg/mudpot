package com.balab

import akka.actor.{ActorSystem, Props}
import akka.pattern.ask
import akka.util.Timeout
import com.balab.service.RoutedService

import org.slf4j.LoggerFactory
import spray.can.Http
import spray.can.Http.Bind

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object DockerServiceMain extends App {



  private val logger = LoggerFactory.getLogger(getClass)

  logger.debug("Scheduler service started ...")
  implicit val timeout = Timeout(60 seconds)

  import services._

  val system = ActorSystem(systemName, aConfig)

  val restInterface = system.actorOf(Props[RoutedService], "RoutedServiceActor")

  val attemptStart = Http(system).manager ? Bind(listener = restInterface, interface = sHost, port = sPort)

  attemptStart.mapTo[Http.Event]
    .map {
      case Http.Bound(address) =>
        logger.debug(s"REST interface bound to $address")

      case Http.CommandFailed(cmd) =>
        logger.debug(s"REST interface could not bind to $host:$port, ${cmd.failureMessage}")
        system.shutdown()
    }



}
