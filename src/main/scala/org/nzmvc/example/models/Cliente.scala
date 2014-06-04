package org.nzmvc.example.models

import java.time.LocalDate

/**
 * Created by Nizer on 03/06/2014.
 */
class Cliente(nome: String, nascimento: LocalDate, var ativo: Boolean)
  extends Pessoa(nome, nascimento)
