package Exercicio

open class ContaCorrente : ContaBancaria() {

    val taxaOperacao: Double = 1.50

    override var numeroConta: Int = 787890

    override fun sacar(saque: Double): Double {
        if((saque + taxaOperacao) <= saldo) {
            saldo = saldo - (saque + taxaOperacao)
        } else {
            println("\u001B[31mSaldo indisponível para saque!\u001B[0m")
        }
        return saldo
    }

    override fun depositar(deposito: Double): Double {
        saldo = saldo + (deposito - taxaOperacao)
        return saldo
    }

    override fun transferir(valor: Double, contaDeposito: ContaBancaria) {
        if (valor > saldo) {
            println("\u001B[31mSaldo indisponível para saque!\u001B[0m")
        } else
            saldo = saldo - valor
            contaDeposito.depositar(valor)
    }

    override fun toString(): String {
        return "Corrente: número da conta $numeroConta"
    }
}