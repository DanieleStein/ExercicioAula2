package Exercicio

//2.Crie as classes Conta Corrente e Conta Poupança que herdam da Conta Bancaria com saldo zerado. A primeira possui
//um atributo taxaDeOperação que é descontado sempre que um saque e um depósito são feitos. A segunda possui um
//atributo limite que dá credito a mais para o correntista caso ele precise sacar mais que o saldo. Neste caso, o saldo
//pode ficar negativo desde que não ultrapasse o limite. Contudo isso não pode acontecer na classe Conta Corrente.

open abstract class ContaBancaria {

    open var numeroConta: Int = 0
    open var saldo: Double = 0.0

    open abstract fun sacar(saque: Double): Double;

    open abstract fun depositar(deposito: Double): Double;

    open fun mostrarDados() {
        println("Número da conta: $numeroConta")
        println("Saldo total: $saldo")
    }

    open fun transferir(valor: Double, contaDeposito : ContaBancaria) {
        contaDeposito.depositar(valor)
    }

}