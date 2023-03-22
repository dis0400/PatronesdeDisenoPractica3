package ej2;

public class Efectivo implements FormaPago{

    private double descuento = 0;
    private double precio;
    private String tipo = "efectivo";
    private double porPagar;

    

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPorPagar() {
        return porPagar;
    }

    public void setPorPagar(double porPagar) {
        this.porPagar = porPagar;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio=precio;
        porPagar = precio - precio*descuento;
    }

    @Override
    public void show() {
        System.out.println("TIPO DE PAGO: "+tipo);
        System.out.println("DESCUENTO: "+descuento+"%");
        System.out.println("TOTAL A PAGAR: "+porPagar+" $");
    }
    
}
