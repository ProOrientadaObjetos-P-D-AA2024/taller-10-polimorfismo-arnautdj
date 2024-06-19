package restaurante;

import java.util.ArrayList;
public class EjecutarRestaurante {

    public static void main(String[] args) {
        MenuNinos menuNinos1 = new MenuNinos("Dedos de pollo", 2.75, 1.00, 1.50);
        MenuNinos menuNinos2 = new MenuNinos("Mini hamburguesa con papas", 3.50, 1.00, 1.50);
        MenuEconomico menuEconomico = new MenuEconomico("Churrasco", 4.25, 25.00);
        MenuDia menuDia = new MenuDia("Lomo salteado con vegetales", 6.75, 1.00, 1.00);
        MenuCarta menuCarta = new MenuCarta("Bife de chorizo con papa rústica", 10.50, 1.50, 2.00, 10.00);

        ArrayList<Menu> listaMenus = new ArrayList<>();
        listaMenus.add(menuNinos1);
        listaMenus.add(menuNinos2);
        listaMenus.add(menuEconomico);
        listaMenus.add(menuDia);
        listaMenus.add(menuCarta);

        for (Menu menu : listaMenus) {
            menu.setValorMenu();
        }

        Cuenta cuenta = new Cuenta("Santiago Rosales", listaMenus, 15);

        System.out.println(cuenta);
    }
    
}
