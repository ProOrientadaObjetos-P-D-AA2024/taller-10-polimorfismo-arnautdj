package juego;

public abstract class Personaje {
    protected String nombre;
    protected int puntosVida;
    protected int nivelExperiencia;

    public Personaje(String nombre, int puntosVida, int nivelExperiencia) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.nivelExperiencia = nivelExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void recibirDano(int dano) {
        this.puntosVida -= dano;
    }

    public void ganarExperiencia(int experiencia) {
        this.nivelExperiencia += experiencia;
    }

    public abstract void atacar(Personaje oponente);
    public abstract void defender();
}


