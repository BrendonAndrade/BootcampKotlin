package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main(){
    val maria = Analista("Maria do Carmo", "12345678911", 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria);
}
