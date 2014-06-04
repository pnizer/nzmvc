package org.nzmvc.server

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.{DefaultServlet, ServletContextHandler}
import com.google.inject.servlet.{GuiceServletContextListener, GuiceFilter}
import javax.servlet.DispatcherType
import java.util.EnumSet.allOf
import com.google.inject.{Guice, Injector}

/**
 * Created by Nizer on 02/06/2014.
 */
object LiteServer {
  def main(args : Array[String]) : Unit = {
    val server = new Server(8080);
    val handler = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS)

    handler.addFilter(classOf[GuiceFilter], "/*", allOf(classOf[DispatcherType]))
    handler.addEventListener(NzGuiceConfig)
    handler.addServlet(classOf[DefaultServlet], "/")

    server.start()
  }
}
