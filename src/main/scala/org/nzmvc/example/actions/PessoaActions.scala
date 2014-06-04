package org.nzmvc.example.actions

import org.nzmvc.domain.{Actor, Actions}
import org.nzmvc.example.models.{Pessoa}

/**
 * Created by Nizer on 03/06/2014.
 */
object PessoaActions extends Actions[Pessoa] {
  def cumprimenta(p: Actor[Pessoa]) = println("Olá, " + p.obj.nome)
}
