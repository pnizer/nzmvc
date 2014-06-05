package org.nzmvc.example.actions

import org.nzmvc.example.models.{Pessoa, Cliente}
import java.time.LocalDate
import org.nzmvc.actions.Domain

import scala.language.dynamics

/**
 * Created by Nizer on 03/06/2014.
 */
object ActionsExample {
  def main(args : Array[String]) : Unit = {
    val encap = createDomain

    val cliente = new Cliente("Walter White", LocalDate.of(1968, 1, 10), true)
    val pessoa = new Pessoa("Jesse Pinkman", LocalDate.of(1980, 8, 30))

    val a = encap(cliente)
    val b = encap(pessoa)

    a.cumprimenta()
    b.cumprimenta()
  }


  def createDomain = {
    val domain = new Domain
    domain.on(classOf[Pessoa]).use(PessoaActions)
    domain.on(classOf[Cliente]).use(ClienteActions)
    domain
  }
}
