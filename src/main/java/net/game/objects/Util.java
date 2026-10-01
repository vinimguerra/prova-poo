package net.game.objects;

public class Util {
    public static void escrever(String mensagem) throws InterruptedException {
        System.out.print(mensagem);
        Thread.sleep(570);
    }
    public static void escreverPorta(String mensagem) throws InterruptedException {
        System.out.println(mensagem);
        Thread.sleep(100);
    }
    public static void digitar(String mensagem) throws InterruptedException {
        for (char c : mensagem.toCharArray()) {
            System.out.print(c);
            Thread.sleep(4);
        }
    }

    public static void digitarInimigo(String mensagem) throws InterruptedException {
        for (char c : mensagem.toCharArray()) {
            System.out.print(c);
            Thread.sleep(1);
        }
    }

}