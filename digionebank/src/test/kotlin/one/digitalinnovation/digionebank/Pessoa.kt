package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Brendon"

    var cpf: String = "123.456.789-00"
    private set
}

fun main(){
    val brendon = Pessoa()

    println(brendon.nome)
    println(brendon.cpf)
}