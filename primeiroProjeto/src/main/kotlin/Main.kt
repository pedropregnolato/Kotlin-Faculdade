import java.math.BigInteger

fun main() {
    println("Hello world!")
    var nome = "Pregs"
    println(nome)
    println("Seja bem vindo, caro $nome!")

    println("") //pulando linha - gambi
    println("/////////////////////////////////////////////////////////////////")
    println("") //pulando linha - gambi

    println("Banco Aleatorio")
    val nomeCorrentista : String = "Pedro"
    val numeroConta : Int = 123000
    val saldo : Double = 2000.0
    val rendimento : Double = 500.0
    val total = saldo + rendimento

    println("Olá, $nomeCorrentista ($numeroConta), seu saldo inicial é de: RS $saldo")
    println("Voce possui um rendimento de R$ $rendimento")
    println("Total: R$ $total")

    println("") //pulando linha - gambi
    println("/////////////////////////////////////////////////////////////////")
    println("") //pulando linha - gambi

    println("Testando if")
    val valorUm = 50
    val valorDois = 50

    if(valorUm > valorDois){
        print("$valorUm é maior que $valorDois!")
    } else if(valorUm < valorDois){
        print("$valorDois é maior que $valorUm!")
    } else {
        print("Os valores são iguais!")
    }

    println("") //pulando linha - gambi
    println("") //pulando linha - gambi
    println("/////////////////////////////////////////////////////////////////")
    println("") //pulando linha - gambi

    println("Testando for")

    for(i in 1 .. 10) {
        println(i)
    }

    println("") //pulando linha - gambi
    println("/////////////////////////////////////////////////////////////////")
    println("") //pulando linha - gambi

    for(i in 1 .. 8) {
        val titular: String = "0$i"
        val numeroConta: Int = 1000 + i
        println("Conta: $titular ($numeroConta)")
    }

    println("") //pulando linha - gambi
    println("/////////////////////////////////////////////////////////////////")
    println("") //pulando linha - gambi

        for(i in 8 downTo  1) {
            val titular : String = "0$i"
            val numeroConta : Int = 1000 + i
            println("Conta: $titular ($numeroConta)")
    }

    println("") //pulando linha - gambi
    println("/////////////////////////////////////////////////////////////////")
    println("") //pulando linha - gambi

    var i = 0
    println("nº ímpares de 1 a 10:")
    for(i in 1 .. 10 step 2) {
        print(i)
    }

    println("") //pulando linha - gambi
    println("") //pulando linha - gambi
    println("/////////////////////////////////////////////////////////////////")
    println("") //pulando linha - gambi

    println("Testando while")

//    var i = 0 //comentado pra rodar - o i ja foi declarado ali em cima como zero, se declarar novamente, da erro de ambiguidade
    while(i < 4) {
        val titular : String = "0$i"
        val numeroConta : Int = 1000 + i
        println("Conta: $titular ($numeroConta)")
        i++
    }

    println("") //pulando linha - gambi
    println("/////////////////////////////////////////////////////////////////")
    println("") //pulando linha - gambi

    println("POO - Classes")
    println("(Primeiro exercicio)")
    println("") //pulando linha - gambi

    class Pessoa() {
        var nome : String = ""
        var sobrenome : String = ""
        var rg : Int = 0
        var cpf : Int = 0
    }
    val pessoa = Pessoa()
    pessoa.nome = "Pedro"
    pessoa.sobrenome = "Pregnolato"
    pessoa.rg = 1234
    pessoa.cpf = 1234
    println("O meu nome é ${pessoa.nome} ${pessoa.sobrenome}") //usando as chaves a variavel fica encapsulada
    println("Meus documentos são:")
    println("RG: ${pessoa.rg}")
    println("CPF: ${pessoa.cpf}")

    println("") //pulando linha - gambi

    val pessoaDois = Pessoa()
    pessoaDois.nome = "Neymar"
    pessoaDois.sobrenome = "jr"
    pessoaDois.rg = 4321
    pessoaDois.cpf = 1234
    println("O meu nome é ${pessoaDois.nome} ${pessoaDois.sobrenome}") //usando as chaves a variavel fica encapsulada
    println("Meus documentos são:")
    println("RG: ${pessoaDois.rg}")
    println("CPF: ${pessoaDois.cpf}")

    println("") //pulando linha - gambi

    val pessoaTres = Pessoa()
    pessoaTres.nome = "João"
    pessoaTres.sobrenome = "Silva"
    pessoaTres.rg = 5678
    pessoaTres.cpf = 5678
    println("O meu nome é ${pessoaTres.nome} ${pessoaTres.sobrenome}") //usando as chaves a variavel fica encapsulada
    println("Meus documentos são:")
    println("RG: ${pessoaTres.rg}")
    println("CPF: ${pessoaTres.cpf}")

    println("") //pulando linha - gambi
    println("/////////////////////////////////////////////////////////////////")
    println("") //pulando linha - gambi

    println("(Segundo exercicio)")
    println("") //pulando linha - gambi

    class Conta() {
        var titular : String = ""
        var numeroConta : Int = 0
        var saldo : Double = 0.0
    }

    val conta = Conta()
    conta.titular = "Deyde Costa"
    conta.numeroConta = 123456
    conta.saldo = 200.00
    println("Olá, ${conta.titular} (${conta.numeroConta})")
    println("Saldo: R$ ${conta.saldo}")

    println("") //pulando linha - gambi
    println("(EXTRA - Segundo exercicio: conta com rendimento)")
    println("") //pulando linha - gambi

    val contaDois = Conta()
    contaDois.titular = "Riquinho Jr."
    contaDois.numeroConta = 101112
    contaDois.saldo = 5000.00
    println("Olá, ${contaDois.titular} (${contaDois.numeroConta})")
    println("Saldo: R$ ${contaDois.saldo}")
    contaDois.saldo += 352.7
    println("RENDIMENTO MENSAL DE R$ 352.70")
    println("Saldo atual: R$ ${contaDois.saldo}")

    println("") //pulando linha - gambi
    println("(EXTRA FUNÇÃO - Segundo exercicio: conta com rendimento)")
    println("") //pulando linha - gambi

    fun deposita(conta : Conta, valor : Double) {
        conta.saldo += valor
    }

    val contaTres = Conta()
    contaTres.titular = "Zé Luiz"
    contaTres.numeroConta = 192835
    contaTres.saldo = 8607.50
    println("Olá, ${contaTres.titular} (${contaTres.numeroConta})")
    println("Saldo: R$ ${contaTres.saldo}")
    deposita(contaTres,522.75)
    println("RENDIMENTO MENSAL DE R$ 522.75")
    println("Saldo atual: R$ ${contaTres.saldo}")

    println("") //pulando linha - gambi
    println("(EXTRA FUNÇÃO - Segundo exercicio: sacar dinheiro)")
    println("") //pulando linha - gambi

    fun saca(conta : Conta, valor : Double) {
        conta.saldo -= valor
    }

    val contaQuatro = Conta()
    contaQuatro.titular = "Maria do Gás"
    contaQuatro.numeroConta = 555000
    contaQuatro.saldo = 1150.68
    println("Olá, ${contaQuatro.titular} (${contaQuatro.numeroConta})")
    println("Saldo: R$ ${contaQuatro.saldo}")
    saca(contaQuatro,650.69)
    println("SACOU R$ 650.69")
    println("Saldo atual: R$ ${contaQuatro.saldo}")

}
