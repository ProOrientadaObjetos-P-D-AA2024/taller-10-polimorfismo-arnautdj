package restaurante;

public abstract class Menu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;

    public Menu(String nombrePlato, double valorInicialMenu) {
        this.nombrePlato = nombrePlato;
        this.valorInicialMenu = valorInicialMenu;
    }

    public abstract void setValorMenu();
    
    public double getValorMenu() {
        return valorMenu;
    }

    @Override
    public String toString() {
        return String.format("Plato: %s\nValor Inicial: %.2f\nValor del Menú: %.2f\n", 
                nombrePlato, valorInicialMenu, valorMenu);
    }
}


