package juego;

public class Batalla {
    public void iniciarBatalla(Personaje p1, Personaje p2) {
        while (p1.getPuntosVida() > 0 && p2.getPuntosVida() > 0) {
            p1.atacar(p2);
            if (p2.getPuntosVida() > 0) {
                p2.atacar(p1);
            }
        }
        if (p1.getPuntosVida() > 0) {
            System.out.println(p1.getNombre() + " ganó la batalla");
            p1.ganarExperiencia(10);
        } else {
            System.out.println(p2.getNombre() + " ganó la batalla");
            p2.ganarExperiencia(10);
        }
    }
}

