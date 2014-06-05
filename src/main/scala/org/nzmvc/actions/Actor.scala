package org.nzmvc.actions

import scala.language.dynamics

/**
 * Created by Nizer on 04/06/2014.
 */
class Actor[T <: AnyRef](domain : Domain, val obj: T) extends Dynamic {
  def applyDynamic(action: String)(args: Any*) : Any = {
    val actions = domain.actionsFor(obj)
    val method = actions.getClass.getMethod(action, this.getClass)
    return method.invoke(actions, this)
  }
}
