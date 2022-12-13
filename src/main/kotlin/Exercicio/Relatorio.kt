package Exercicio

open class Relatorio {

    open fun gerarRelatorio(conta : ContaBancaria) {
        println(conta.mostrarDados())
    }
}