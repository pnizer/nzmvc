package org.nzmvc.actions

import scala.language.dynamics
import org.reflections.Reflections
import org.nzmvc.annotations.Actions
import scala.collection.JavaConversions._

/**
 * Created by Nizer on 03/06/2014.
 */
class Domain(basePackaged: String = null) {
  def actionsFor(obj: AnyRef) = map(obj.getClass)

  var map = Map[Class[_], AnyRef]()

  if (basePackaged != null) {
    val reflections = new Reflections(basePackaged)
    val classes = reflections.getTypesAnnotatedWith(classOf[Actions])

    def getActionsOf(clazz: Class[_]) : Class[_] = {
      clazz.getAnnotation(classOf[Actions]).of()
    }

    val newMap = classes.foreach(c => map += (getActionsOf(c) -> c.newInstance().asInstanceOf[AnyRef]))
  }

  def apply[T <: AnyRef](obj : T) : Actor[T] = {
    new Actor[T](this, obj)
  }

  def on[A <: AnyRef](clazz: Class[A]) = new {
    def use (action: AnyRef) = {
      map += (clazz -> action)
      Domain.this
    }
  }
}
