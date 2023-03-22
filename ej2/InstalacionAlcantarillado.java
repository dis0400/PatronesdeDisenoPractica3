package ej2;

public class InstalacionAlcantarillado implements Instalacion {
    private double precio;
    private String tipo; 
    private double metrosCuadrados;

    private FormaPago formaPago;

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }
    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }
    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    

    public InstalacionAlcantarillado(double precio, String tipo, double metrosCuadrados, FormaPago formaPago) {
        this.precio = precio;
        this.tipo = tipo;
        this.metrosCuadrados = metrosCuadrados;
        this.formaPago = formaPago;
    }

    @Override
    public void instalar() {
        System.out.println("--------------------------------------------------");
        System.out.println("SE REALIZO CON EXITO LA INSTALACION DE ALCANTARILLADO");
        System.out.println("TIPO: "+tipo+" METROS CUADRADOS: "+metrosCuadrados);
        System.out.println("TOTAL: "+precio+" $");
        this.pedirPago();
    }
    @Override
    public void pedirPago() {
        formaPago.setPrecio(this.precio);
        formaPago.show();
    }
    
}
