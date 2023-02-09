package com.maxbotero;

public class AgregaIva {
    public static void main(String[] args) {
        double precio = 5000;
        double precioIva = calculaIva(precio);
        System.out.println(precioIva);

    }
    static double calculaIva (double precio) {
        double iva = precio * 0.16;//calcula un iva del 16%
        return precio + iva;
    }
}
