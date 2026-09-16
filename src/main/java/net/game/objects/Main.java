package net.game.objects;

import java.util.Scanner;
import java.util.Random;



public class Main {
    public static Random random = new Random();
    public static Player player1;
    public static Inimigo inimigo1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int porta;

        System.out.println("Qual o seu nome? ");
        String nome = sc.nextLine();

        player1 = new Player(nome, 100, 5);
        inimigo1 = new Inimigo(60, 5);

        player1.dadosPlayer();

        do {
            System.out.println(
                            "   _______        _______        _______\n" +
                            "  /       \\      /       \\      /       \\\n" +
                            " | ┌─┬─┬─┐ |    | ┌─┬─┬─┐ |    | ┌─┬─┬─┐ |\n" +
                            " | ├─┼─┼─┤ |    | ├─┼─┼─┤ |    | ├─┼─┼─┤ |\n" +
                            " | └─┴─┴─┘ |    | └─┴─┴─┘ |    | └─┴─┴─┘ |\n" +
                            " |         |    |         |    |         |\n" +
                            " |    O    |    |    O    |    |    O    |\n" +
                            " |         |    |         |    |         |\n" +
                            " |_________|    |_________|    |_________|\n" +
                            "     [1]             [2]             [3]"
            );

            System.out.println("Escolha uma porta: ");
            porta = sc.nextInt();

            if (porta <= 3 && porta >= 1) {
                evento();
            }

        } while(porta <= 3 && porta >= 1);
    }

    public static void evento() {
        int sorteio = random.nextInt(100) + 1;
        System.out.println(sorteio);

        if (sorteio > 10) {
            inimigo1.receberDano(player1.dano);
            System.out.println(inimigo1.vida);
        }
    }
}

