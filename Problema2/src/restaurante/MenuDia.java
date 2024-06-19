package restaurante;

public class MenuDia extends Menu {
    private double valorPostre;
    private double valorBebida;

    public MenuDia(String nombrePlato, double valorInicialMenu, double valorPostre, double valorBebida) {
        super(nombrePlato, valorInicialMenu);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }

    @Override
    public void setValorMenu() {
        valorMenu = valorInicialMenu + valorPostre + valorBebida;
    }

    @Override
    public String toString() {
        return String.format("Menú del Día:\n%sValor bebida: %.2f\nValor postre: %.2f\n", 
                super.toString(), valorBebida, valorPostre);
    }
}

