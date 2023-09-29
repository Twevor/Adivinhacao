package OrientaçãoObjeto.Adivinhacao;

import java.util.Scanner;

import OrientaçãoObjeto.Adivinhacao.domain.Jogo;
import OrientaçãoObjeto.Adivinhacao.domain.Player;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Bem vindo ao jogo de adivinhação!");
        System.out.println(
                "As regras são simples: Iremos pensar em um número aleatório entre 0 e 100 e você terá 3 chances para descobri-lo!\nBoa sorte!");
        System.out.print("\nNos diga o seu nome: ");
        String nome = scanner.nextLine();
        Player player = new Player(nome);
        Jogo jogo = new Jogo(player);

        jogo.setRandomNumber();

        do {
            System.out.println("\nDiga seu palpite: ");
            int palpite = scanner.nextInt();
            jogo.setNumber(palpite);
            System.out.println(jogo.hpDamage());
            jogo.erro();

        } while (jogo.endGame());
        scanner.close();
    }
}
