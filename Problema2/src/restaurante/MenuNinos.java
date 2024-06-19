package restaurante;

public class MenuNinos extends Menu {
    private double valorHelado;
    private double valorPastel;

    public MenuNinos(String nombrePlato, double valorInicialMenu, double valorHelado, double valorPastel) {
        super(nombrePlato, valorInicialMenu);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
    }

    @Override
    public void setValorMenu() {
        valorMenu = valorInicialMenu + valorHelado + valorPastel;
    }

    @Override
    public String toString() {
        return String.format("Menú de Niños:\n%sValor helado: %.2f\nValor pastel: %.2f\n", 
                super.toString(), valorHelado, valorPastel);
    }
}

