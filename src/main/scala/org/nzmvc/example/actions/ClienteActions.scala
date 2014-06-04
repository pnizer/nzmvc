package org.nzmvc.example.actions

import org.nzmvc.domain.{Actor, Actions}
import org.nzmvc.example.models.Cliente

/**
 * Created by Nizer on 03/06/2014.
 */
object ClienteActions extends Actions[Cliente] {
  def cumprimenta(p: Actor[Cliente]) = println("Olá, Sr. cliente " + p.obj.nome)
}
