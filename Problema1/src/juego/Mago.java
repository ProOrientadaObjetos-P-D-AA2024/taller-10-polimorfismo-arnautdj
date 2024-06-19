package juego;

public class Mago extends Personaje {
    private int poderMagico;

    public Mago(String nombre, int puntosVida, int nivelExperiencia, int poderMagico) {
        super(nombre, puntosVida, nivelExperiencia);
        this.poderMagico = poderMagico;
    }

    @Override
    public void atacar(Personaje oponente) {
        int dano = poderMagico * nivelExperiencia;
        oponente.recibirDano(dano);
        System.out.println(nombre + " lanza un hechizo a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }

    @Override
    public void defender() {
        System.out.println(nombre + " se defiende con un escudo mágico.");
    }
}


