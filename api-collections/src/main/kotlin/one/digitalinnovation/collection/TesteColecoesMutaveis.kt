package one.digitalinnovation.collection

fun main() {
    val joao = funcionario("João", 2000.0, "CLT")
    val pedro = funcionario("Pedro", 1500.0, "PJ")
    val maria = funcionario("Maria", 4000.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{ println(it) }

    println("-------------------------------")

    funcionarios.add(pedro)
    funcionarios.forEach{ println(it) }

    println("-------------------------------")

    funcionarios.remove(joao)
    funcionarios.forEach{ println(it) }

    println("-------------------------------")

    val funcionarioSet = mutableSetOf(joao)

    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)

    funcionarioSet.forEach{ println(it) }

}