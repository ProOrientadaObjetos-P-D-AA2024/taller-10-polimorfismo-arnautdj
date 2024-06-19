package restaurante;

import java.util.ArrayList;


public class Cuenta {
    private String nombreCliente;
    private ArrayList<Menu> listaMenus;
    private double subtotal;
    private double iva;
    private double valorTotal;

    public Cuenta(String nombreCliente, ArrayList<Menu> listaMenus, double iva) {
        this.nombreCliente = nombreCliente;
        this.listaMenus = listaMenus;
        this.iva = iva;
        setSubtotal();
        setValorCancelar();
    }

    public void setSubtotal() {
        subtotal = 0;
        for (Menu menu : listaMenus) {
            subtotal += menu.getValorMenu();
        }
    }

    public void setValorCancelar() {
        valorTotal = subtotal + (subtotal * iva / 100);
    }

    @Override
    public String toString() {
        String resultado = String.format("Factura\nCliente: %s\n", nombreCliente);
        
        for (Menu menu : listaMenus) {
            resultado += String.format("%s\n", menu);
        }
        
        resultado += String.format("Subtotal: %.2f\nIVA: %.2f%%\nTotal a pagar: %.2f\n", 
                                   subtotal, iva, valorTotal);
        return resultado;
    }
}


