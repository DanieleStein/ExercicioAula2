package Exercicio

open class ContaPoupanca : ContaBancaria() {

    open var limite: Double = 500.0

    override var numeroConta: Int = 343456


    override fun sacar(saque: Double): Double {
        if (saque > saldo) {
            saldo = saldo + limite
            if(saldo >= saque) {
                saldo = saldo - saque
            }
        } else {
            println("\u001B[31mSaldo indisponível para saque!\u001B[0m")
        }
        return saldo
    }

    override fun depositar(deposito: Double): Double {
        saldo = saldo + deposito
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
        return "Poupança: número da conta $numeroConta"
    }
}