package juego;

public class EjecutarJuego {

    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Ironman", 100, 5, 10);
        Mago mago = new Mago("Harry Potter", 80, 5, 12);
        Arquero arquero = new Arquero("Robin Hood", 90, 5, 8);

        Batalla batalla = new Batalla();
        batalla.iniciarBatalla(guerrero, mago);
        System.out.println();

        batalla.iniciarBatalla(mago, arquero);
        System.out.println();

        batalla.iniciarBatalla(arquero, guerrero);
    }
    
}
