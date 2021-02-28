package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main(){
    val joao = Analista("João Pedro", "12345678911", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao);
}