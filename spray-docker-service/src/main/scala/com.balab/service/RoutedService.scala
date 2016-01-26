package com.balab.service

import akka.actor.{ActorLogging, Actor}
import akka.util.Timeout
import scala.concurrent.duration._
import spray.routing._

/**
  * Created by bbalaji on 26/1/16.
  */
class RoutedService extends HttpServiceActor with RestApi {

  def receive = runRoute(routes)

}


trait RestApi extends HttpService with Actor with ActorLogging {


  implicit val timeout = Timeout(10 seconds)

  def routes: Route = {


    path("ping") {
      get {
        complete("!Pong.")
      }
    }
  }
}
