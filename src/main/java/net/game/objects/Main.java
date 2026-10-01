package net.game.objects;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static String nomeInserido;
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();
    public static Player player;
    public static Inimigo rato;
    public static Bigorna bigorna1;
    public static Pocao pocao1;
    public static int round = 1;
    public static void gameOver() throws InterruptedException {

        Util.escrever("\nVocê morreu, " + player.nome + "!");
        Util.escrever("\n\n  ██████╗   █████╗  ███╗   ███╗ ███████╗     ██████╗  ██╗   ██╗ ███████╗ ██████╗ \n");
        Util.escrever(" ██╔════╝  ██╔══██╗ ████╗ ████║ ██╔════╝    ██╔═══██╗ ██║   ██║ ██╔════╝ ██╔══██╗\n");
        Util.escrever(" ██║  ███╗ ███████║ ██╔████╔██║ █████╗      ██║   ██║ ██║   ██║ █████╗   ██████╔╝\n");
        Util.escrever(" ██║   ██║ ██╔══██║ ██║╚██╔╝██║ ██╔══╝      ██║   ██║ ╚██╗ ██╔╝ ██╔══╝   ██╔══██╗\n");
        Util.escrever(" ╚██████╔╝ ██║  ██║ ██║ ╚═╝ ██║ ███████╗    ╚██████╔╝  ╚████╔╝  ███████╗ ██║  ██║\n");
        Util.escrever("  ╚═════╝  ╚═╝  ╚═╝ ╚═╝     ╚═╝ ╚══════╝     ╚═════╝    ╚═══╝   ╚══════╝ ╚═╝  ╚═╝\n");

        reiniciar();
    }

    public static void win() throws InterruptedException {
        Util.escrever("\nParabéns, " + player.nome + " você venceu o Rato!\n\n");
        Util.escrever("██╗   ██╗  ██████╗  ██╗   ██╗    ██╗    ██╗ ██╗ ███╗   ██╗ ██╗\n");
        Util.escrever("╚██╗ ██╔╝ ██╔═══██╗ ██║   ██║    ██║    ██║ ██║ ████╗  ██║ ██║\n");
        Util.escrever(" ╚████╔╝  ██║   ██║ ██║   ██║    ██║ █╗ ██║ ██║ ██╔██╗ ██║ ██║\n");
        Util.escrever("  ╚██╔╝   ██║   ██║ ██║   ██║    ██║███╗██║ ██║ ██║╚██╗██║ ╚═╝\n");
        Util.escrever("   ██║    ╚██████╔╝ ╚██████╔╝    ╚███╔███╔╝ ██║ ██║ ╚████║ ██╗\n");
        Util.escrever("   ╚═╝     ╚═════╝   ╚═════╝      ╚══╝╚══╝  ╚═╝ ╚═╝  ╚═══╝ ╚═╝\n");

        reiniciar();
    }

    public static void reiniciar() throws InterruptedException {
        player.vida = 30;
        player.dano = 5;

        rato.vida = 50;
        rato.dano = 4;


        Util.escrever("\n\nReiniciar?\n>>> ");
        String reiniciar = sc.nextLine();

        if(reiniciar.equalsIgnoreCase("sim")){
            portas();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("\n\n\n\n");
        Util.digitar("""
                                                            ██████╗   ██████╗   ██████╗  ██████╗ 
                                                            ██╔══██╗ ██╔═══██╗ ██╔═══██╗ ██╔══██
                                                            ██║  ██║ ██║   ██║ ██║   ██║ ██████╔╝ 
                                                            ██║  ██║ ██║   ██║ ██║   ██║ ██╔══██╗
                                                            ██████╔╝ ╚██████╔╝ ╚██████╔╝ ██║  ██║
                                                            ╚═════╝   ╚═════╝   ╚═════╝  ╚═╝  ╚═╝
                                            ███╗   ███╗  █████╗  ██████╗  ███╗   ██╗ ███████╗ ███████╗ ███████╗ 
                                            ████╗ ████║ ██╔══██╗ ██╔══██╗ ████╗  ██║ ██╔════╝ ██╔════╝ ██╔════╝ 
                                            ██╔████╔██║ ███████║ ██║  ██║ ██╔██╗ ██║ █████╗   ███████╗ ███████╗ 
                                            ██║╚██╔╝██║ ██╔══██║ ██║  ██║ ██║╚██╗██║ ██╔══╝   ╚════██║ ╚════██║ 
                                            ██║ ╚═╝ ██║ ██║  ██║ ██████╔╝ ██║ ╚████║ ███████╗ ███████║ ███████║ 
                                            ╚═╝     ╚═╝ ╚═╝  ╚═╝ ╚═════╝  ╚═╝  ╚═══╝ ╚══════╝ ╚══════╝ ╚══════╝



                                                ██╗ ███╗   ██╗ ██╗  ██████╗ ██╗  █████╗  ██████╗  ██████╗
                                                ██║ ████╗  ██║ ██║ ██╔════╝ ██║ ██╔══██╗ ██╔══██  ╚═════██╗
                                                ██║ ██╔██╗ ██║ ██║ ██║      ██║ ███████║ ██████╔╝   █████╔╝ 
                                                ██║ ██║╚██╗██║ ██║ ██║      ██║ ██╔══██║ ██╔══██╗   ╚═══╝ 
                                                ██║ ██║ ╚████║ ██║ ╚██████╗ ██║ ██║  ██║ ██║  ██║    ██╗ 
                                                ╚═╝ ╚═╝  ╚═══╝ ╚═╝  ╚═════╝ ╚═╝ ╚═╝  ╚═╝ ╚═╝  ╚═╝    ╚═╝
                                                Digite 'sim' ou pressione ENTER para iniciar o jogo:""");

        String resposta = sc.nextLine();

        if (resposta.isEmpty() || resposta.equalsIgnoreCase("sim")) {

            Util.digitar("\nO Rato conquistou todas as portas! Mate-o ou morra!\n\n");

            do {
                Util.digitar("Digite o Nickname: ");
                nomeInserido = sc.nextLine();
            } while (nomeInserido.isEmpty());

            player = new Player(nomeInserido, 30, 5);

            rato = new Inimigo(50, 4 + round);

            player.status();
            portas();

        }
    }

    public static void portas() throws InterruptedException {
        int opcao;

        while (player.vida > 0 && rato.vida > 0) {
            Util.escreverPorta("\n\n        ------------- Escolha uma Porta -------------");
            Util.escreverPorta("            _________     _________     _________ ");
            Util.escreverPorta("           |  _   _  |   |  _   _  |   |  _   _  |");
            Util.escreverPorta("           | | | | | |   | | | | | |   | | | | | |");
            Util.escreverPorta("           | | | | | |   | | | | | |   | | | | | |");
            Util.escreverPorta("           | |_| |_| |   | |_| |_| |   | |_| |_| |");
            Util.escreverPorta("           |¬ _   _  |   |¬ _   _  |   |¬ _   _  |");
            Util.escreverPorta("           | | | | | |   | | | | | |   | | | | | |");
            Util.escreverPorta("           | |_| |_| |   | |_| |_| |   | |_| |_| |");
            Util.escreverPorta("           |_________|   |_________|   |_________|");
            Util.escreverPorta("              [ 1 ]         [ 2 ]         [ 3 ]   ");
            Util.escrever("\nDigite 1, 2 ou 3\n>>> ");

            opcao = sc.nextInt();
            sc.nextLine();

            while (opcao < 1 || opcao > 3) {
                Util.escrever("\nOpção inválida! Digite 1, 2 ou 3.\n>>> ");
                opcao = sc.nextInt();
                sc.nextLine();
            }

            eventoPorta();
            round++;
            rato.dano = 4 + round;
            if (player.vida <= 0) {
                gameOver();
            } else if (rato.vida <=0)
                win();
        }
    }

    public static void eventoPorta() throws InterruptedException {

        int sorteio = random.nextInt(100) + 1;

        if (sorteio <= 50) {

            Util.digitarInimigo("""
O Rato apareceu!
                    ▒███████▒▒█████████████████████████████████████████████████████▒
                    ▒█████████▒▒███████████████████████████████████████████████████▒
                    ▒████████▓█████████████████▒▒▒▒▒▒▒▒▒▒▒▓████▓▒▒▒▓▒░▒████████████▒
                    ▒█████▒▒▒▓█████████████▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▓▓▓▒░░░▒███████████▒
                    ▒████▒▒▓██████████████▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▓████████▒
                    ▒██▓░▓██████████████▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓▒▒▒▒▒██▒██▓▒
                    ▒▓▒▒██████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒░▒▓▓▓▒
                    ▒▒░░████████████▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒██▒
                    ▒▒░░██████████▓▒▒▒▒░▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒░░░░░░████▒
                    ▒▓▒▒▒████████▓▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒█████▒
                    ▒██▓▒▒▒▒▒▒▒▒▒▒▒▓▓▓▒▒▒▒▒▒▒▒▒░░░░░░░░░░░▒▒▒▒▒▒░░░░░▓█████▓███████▒
                    ▒█████▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▓▓██▒▒▒▒▒▒▒▒▓███▓▒░▓████████████▒
                    ▒███████████████▓▒▒░▓████████▒▒▒▒▓████▒▒▒▒▒█████▓▒▓████████████▒
                    ▒███████████████▓▒▒░▓██████████████████▓▒▒▒▓█████▓█████████████▒
                    ▒███████████████▓▒▓▓▒▓██████████████████▓░▒▓▓▓▓▒▓██████████████▒
                    ▒████████████████▓▓▓▓█████████████████████▓▓▓▓▓████████████████▒
                    """);
            rato.receberDano(player.dano);
            Util.escrever("\nVocê ataca o Rato, causando " + player.dano + " de dano!");
            Util.escrever("\nO Rato está com " + rato.vida + " de vida!");
            Thread.sleep(900);
            if(rato.vida > 0){
                player.receberDano(rato.dano);
                Util.escrever("\nO Rato contra-ataca, causando " + rato.dano + " de dano!");
                Util.escrever("\nVocê está com " + player.vida + " de vida!");
                Thread.sleep(900);
            }

        }
        else if (sorteio <= 75) {
            pocao1 = new Pocao(Main.random.nextInt(5) + 5);

            player.vida += pocao1.restaura;

            if (player.vida >= 30){
                player.vida = 30;
            }

            Util.escrever("\nVocê encontrou uma poção e recuperou " + pocao1.restaura + " de vida!");
            Util.escrever("\nVocê está com " + player.vida + " de vida!");
            Thread.sleep(900);
        }
        else {
            bigorna1 = new Bigorna(Main.random.nextInt(3) + 3);

            player.dano += bigorna1.powerUp;

            Util.escrever("\nVocê encontrou uma bigorna! Seu dano aumentou em " + bigorna1.powerUp);
            Thread.sleep(900);
        }

    }

}
