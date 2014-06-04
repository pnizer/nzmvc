package org.nzmvc.mvc

/**
 * Created by Nizer on 02/06/2014.
 */
abstract class ActionResult
case class View(viewName: String = null) extends ActionResult {
  def shared (values: Map[String, AnyRef]) : View = { this }
}
