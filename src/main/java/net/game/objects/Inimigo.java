package net.game.objects;

public class Inimigo {
    int vida;
    int dano;

    public Inimigo(int vida, int dano) {
        this.vida = vida;
        this.dano = dano;
    }

    public void dadosInimigo() {
        System.out.println("Vida: " + vida);
        System.out.println("Dano: " + dano);
        System.out.println("==================");
    }

    public void receberDano(int dano) {
        this.vida -= this.dano;
    }
}
