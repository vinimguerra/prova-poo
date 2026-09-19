package net.game.objects;

import java.util.Scanner;
import java.util.Random;


public class Main {
    public static Random random = new Random();
    public static Player player1;
    public static Inimigo inimigo1;
    public static EsqueletoMolestador esqueleto1;

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int porta;


        Delay.digitar("Qual o seu nome? ");
        String nome = sc.nextLine();

        player1 = new Player(nome, 100, 5);
        inimigo1 = new Inimigo(60, 5);
        esqueleto1 = new EsqueletoMolestador(80, 20);

        player1.dadosPlayer();

        do {
            System.out.println(
                            "   _______        _______        _______\n" +
                            "  /       \\     /       \\     /       \\\n" +
                            " | ┌─┬─┬─┐ |    | ┌─┬─┬─┐ |    | ┌─┬─┬─┐ |\n" +
                            " | ├─┼─┼─┤ |    | ├─┼─┼─┤ |    | ├─┼─┼─┤ |\n" +
                            " | └─┴─┴─┘ |    | └─┴─┴─┘ |    | └─┴─┴─┘ |\n" +
                            " |         |    |         |    |         |\n" +
                            " |    O    |    |    O    |    |    O    |\n" +
                            " |         |    |         |    |         |\n" +
                            " |_________|    |_________|    |_________|\n" +
                            "     [1]             [2]             [3]"
            );

            System.out.println("\nEscolha uma porta: \n>>>");
            porta = sc.nextInt();

            if (porta <= 3 && porta >= 1) {
                evento();
            }

        } while(porta <= 3 && porta >= 1);
    }

    public static void evento() {
        int sorteio = random.nextInt(100) + 1;
        System.out.println(sorteio);


        if (sorteio <= 50) {
            inimigo1.receberDano(player1.dano);
            System.out.println("O inimigo levou " + inimigo1.dano + " de dano!");

            inimigo1.dadosInimigo();


        } else if (sorteio <= 80) {
            player1.receberDano(esqueleto1.dano);
            System.out.println("Você foi molestado por esqueletos ");
        }
    }
}

