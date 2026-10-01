package net.game.objects;

public class Inimigo {
    int vida, dano;

    public Inimigo(int vida, int dano) {
        this.vida = vida;
        this.dano = dano;
    }

    public void receberDano(int danoRecebido) {
        this.vida -= danoRecebido;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }
}