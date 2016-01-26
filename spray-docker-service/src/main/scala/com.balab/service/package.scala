package com.balab

import com.typesafe.config.ConfigFactory

/**
  * Created by bbalaji on 26/1/16.
  */
package object services {

  val aConfig = ConfigFactory.load().getConfig("akka")
  val host = aConfig.getString("host")
  val port = aConfig.getInt("port")

  val systemName = aConfig.getString("system")

  val sConfig = ConfigFactory.load().getConfig("spray")

  val sHost = sConfig.getString("http.host")
  val sPort = sConfig.getInt("http.port")
}
