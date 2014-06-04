package org.nzmvc.server

import com.google.inject.servlet.ServletModule
import org.nzmvc.servlet.NzServlet

/**
 * Created by Nizer on 02/06/2014.
 */
object NzServletModule extends ServletModule {
  override def configureServlets() = {
    serve("/*").`with`(NzServlet)
  }
}
