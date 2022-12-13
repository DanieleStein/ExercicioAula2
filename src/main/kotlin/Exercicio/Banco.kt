package Exercicio

open class Banco {

    open var listaContas = mutableListOf<ContaBancaria>()

    open  fun inserir(conta : ContaBancaria) {
        listaContas.add(conta)
    }

    open fun remover(conta : ContaBancaria) {
        listaContas.remove(conta)
    }

    open fun showAccounts() {
        println("Minha lista de contas $listaContas")
    }

    open fun procurarConta(numero: Int){
        var counts = listaContas.filter { it.numeroConta == numero }

        if (counts.isNotEmpty()) {
            println(counts)
        } else {
            println(null)
        }
    }
}