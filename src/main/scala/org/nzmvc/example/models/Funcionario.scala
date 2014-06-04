package org.nzmvc.example.models

import java.time.LocalDate

/**
 * Created by Nizer on 03/06/2014.
 */
class Funcionario(var matricula: String, nome: String, nascimento: LocalDate)
  extends Pessoa(nome, nascimento)
