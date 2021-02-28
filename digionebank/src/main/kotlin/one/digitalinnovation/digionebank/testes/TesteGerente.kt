package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main(){
    val maria = Gerente("Maria do Carmo", "12345678911", 5000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(maria);

    TesteAutenticacao().autentica(maria)
}
