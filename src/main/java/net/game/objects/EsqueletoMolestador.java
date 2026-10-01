package net.game.objects;

public class EsqueletoMolestador {
    int dano, vida;

    public EsqueletoMolestador(int dano, int vida) {
        this.dano = dano;
        this.vida = vida;
    }

    public void receberDano(int dano) {
        this.vida -= this.dano;
    }
}
