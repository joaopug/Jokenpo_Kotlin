fun main() {
    var escolha = ""
    var decisao = ""
    var opcoes = listOf("Rocha", "Pergaminho", "Tesoura")
    var hud = ""
    var opcaoRandomizada = opcoes.random()

    println("\nBem-vindo ao mega jogo Rocha-Pergaminho-Podadereira Max Version!!!" + "\nDigite os seguintes comandos para jogar:" + "\n1 Rocha || 2 - Pergaminho || 3 - Podadeira")
    escolha = readLine()!!

    if (escolha == "1") {
        hud = "Rocha"
    } else if (escolha == "2") {
        hud = "Pergaminho"
    } else {
        hud = "Podadeira"
    }

    println("Escolha do usuário = " + hud)
    println("Escolha do computador = " + opcaoRandomizada)

    if (opcaoRandomizada == "Rocha" && escolha == "1" || opcaoRandomizada == "Pergaminho" && decisao == "2" || opcaoRandomizada == "Podadeira" && decisao == "3") {
        println("Empate")
    } else if (opcaoRandomizada == "Pergaminho" && escolha == "1" || opcaoRandomizada == "Rocha" && escolha == "3" || opcaoRandomizada == "Podadeira" && decisao == "2") {
        println("Perdeu")
    }  else if (opcaoRandomizada == "Tesoura" && escolha == "1" || opcaoRandomizada == "Rocha" && escolha == "2" || opcaoRandomizada == "Podadeira" && decisao == "1") {
        println("Venceu")
    }
}