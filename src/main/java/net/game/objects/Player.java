package net.game.objects;

public class Player {
    String nome;
    int vida, dano;

    public Player(String nomeInserido, int vida, int dano) {
        this.nome = nomeInserido;
        this.vida = vida;
        this.dano = dano;
    }


    public void status() throws InterruptedException {
        Util.escrever("\nNome: " + this.nome);
        Util.escrever("\nVida: " + this.vida);
        Util.escrever("\nDano: " + this.dano);
    }

    public void receberDano(int danoRecebido) {
        this.vida -= danoRecebido;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }
}
