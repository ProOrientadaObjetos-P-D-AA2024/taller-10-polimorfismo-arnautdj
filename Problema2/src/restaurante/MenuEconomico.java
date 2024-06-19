package restaurante;

public class MenuEconomico extends Menu {
    private double porcentajeDescuento;

    public MenuEconomico(String nombrePlato, double valorInicialMenu, double porcentajeDescuento) {
        super(nombrePlato, valorInicialMenu);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public void setValorMenu() {
        valorMenu = valorInicialMenu - (valorInicialMenu * porcentajeDescuento / 100);
    }

    @Override
    public String toString() {
        return String.format("Menú Económico:\n%sPorcentaje Descuento: %.2f\n", 
                super.toString(), porcentajeDescuento);
    }
}

