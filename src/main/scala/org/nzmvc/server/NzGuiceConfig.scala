package org.nzmvc.server

import com.google.inject.servlet.GuiceServletContextListener
import com.google.inject.{Guice, Injector}

/**
 * Created by Nizer on 02/06/2014.
 */
object NzGuiceConfig extends GuiceServletContextListener {
  override def getInjector: Injector = Guice.createInjector(NzServletModule)
}