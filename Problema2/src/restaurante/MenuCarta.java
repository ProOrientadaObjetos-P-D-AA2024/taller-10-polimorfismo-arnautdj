package restaurante;

public class MenuCarta extends Menu {
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;

    public MenuCarta(String nombrePlato, double valorInicialMenu, double valorGuarnicion, double valorBebida, double porcentajeAdicional) {
        super(nombrePlato, valorInicialMenu);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeAdicional = porcentajeAdicional;
    }

    @Override
    public void setValorMenu() {
        valorMenu = valorInicialMenu + valorGuarnicion + valorBebida + (valorInicialMenu * porcentajeAdicional / 100);
    }

    @Override
    public String toString() {
        return String.format("Menú a la Carta:\n%sValor guarnición: %.2f\nValor bebida: %.2f\nPorcentaje Adicional: %.2f\n", 
                super.toString(), valorGuarnicion, valorBebida, porcentajeAdicional);
    }
}

