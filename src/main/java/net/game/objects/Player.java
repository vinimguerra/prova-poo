package net.game.objects;

public class Player {
    String nome;
    int vida, dano;

    public Player(String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    public void dadosPlayer() {
        System.out.println("==================");
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Dano: " + dano);
        System.out.println("==================");
    }

    public void receberDano(int dano) {
        this.vida -= this.dano;
    }
}
