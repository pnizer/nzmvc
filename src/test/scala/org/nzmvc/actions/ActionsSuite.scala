package org.nzmvc.actions

import collection.mutable.Stack
import org.scalatest._
import java.time.LocalDate
import org.nzmvc.annotations.Actions
import org.scalatest.FunSuite

import scala.language.dynamics

/**
 * Created by Nizer on 04/06/2014.
 */
class Person(var name: String)

@Actions(of = classOf[Person])
class PersonActions {
  def sayHello(p: Actor[Person]) = p.obj.name + " said hello"
}

class ActionsSuite extends FunSuite {
  test("An action domain should find classes with annotation @Actions and map it with a class type") {
    val domain = new Domain(basePackaged = "org.nzmvc.actions")
    val person = domain(new Person("John"))
    assert(person.sayHello() == "John said hello")
  }
}
