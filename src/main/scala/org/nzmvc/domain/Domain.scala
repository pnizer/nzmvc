package org.nzmvc.domain

import scala.language.dynamics

/**
 * Created by Nizer on 03/06/2014.
 */
class Domain {
  def actionsFor(obj: AnyRef) = map(obj.getClass)

  var map = Map[Class[_], Actions[_]]()

  def apply[T <: AnyRef](obj : T) : Actor[T] = {
    new Actor[T](this, obj)
  }

  def on[A <: AnyRef](clazz: Class[A]) = new {
    def use [T <: Actions[_ <: A]](action: T) = {
      map += (clazz -> action)
      Domain.this
    }
  }
}
