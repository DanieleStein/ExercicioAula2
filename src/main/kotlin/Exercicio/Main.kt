package Exercicio

fun main() {

        val relatorio = Relatorio()

        var poupanca = ContaPoupanca()
        poupanca.numeroConta
        poupanca.depositar(50.0)
        poupanca.sacar(400.0)

        var corrente = ContaCorrente()
        corrente.numeroConta
        corrente.depositar(400.0)
        corrente.sacar(200.0)

        poupanca.transferir(50.0, corrente)

        relatorio.gerarRelatorio(poupanca)
        relatorio.gerarRelatorio(corrente)

        var banco = Banco()
        banco.inserir(poupanca)
        banco.inserir(corrente)
        banco.remover(poupanca)
        banco.showAccounts()
        banco.inserir(poupanca)

        banco.procurarConta(787890)
}