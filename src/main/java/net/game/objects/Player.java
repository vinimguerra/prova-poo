package net.game.objects;

public class Player {
    String nome;
    int vida, dano, ouro;

    public Player(String nome, int vida, int dano, int ouro) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.ouro = ouro;
    }

    public void dadosPlayer() {
        System.out.println("==================");
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Dano: " + dano);
        System.out.println("Ouro: " + ouro);
        System.out.println("==================");
    }

    public void receberDano() {
        this.vida -= dano;
    }
}
