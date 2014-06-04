package org.nzmvc.example.controllers

import org.nzmvc.mvc.{View, ActionResult}
import org.nzmvc.annotations.Controller

/**
 * Created by Nizer on 02/06/2014.
 */
@Controller object Home {
  def index : ActionResult = View()

  def about : ActionResult = {
    val args = Map("foo" -> "hello", "bar" -> "world")
    View() shared args
  }
}
