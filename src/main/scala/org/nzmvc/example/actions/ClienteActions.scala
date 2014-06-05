package org.nzmvc.example.actions

import org.nzmvc.actions.{Actor}
import org.nzmvc.example.models.Cliente

/**
 * Created by Nizer on 03/06/2014.
 */
object ClienteActions {
  def cumprimenta(p: Actor[Cliente]) = println("Olá, Sr. cliente " + p.obj.nome)
}
