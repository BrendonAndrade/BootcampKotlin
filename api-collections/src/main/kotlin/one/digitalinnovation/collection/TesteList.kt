package one.digitalinnovation.collection

fun main() {
    val joao = funcionario("João", 2000.0, "CLT")
    val pedro = funcionario("Pedro", 1500.0, "PJ")
    val maria = funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach {
        println(it)
    }

    println("-------------------------------")

    println(funcionarios.find { it.nome == "Maria" })

    println("-------------------------------")

    funcionarios
        .sortedBy { it.salario }
        .forEach{ println(it) }

    println("-------------------------------")

    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{ println(it) }

    println("-------------------------------")

    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{ println(it) }
}