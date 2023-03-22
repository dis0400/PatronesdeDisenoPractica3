package ej3;

public abstract class Component {
    private String nombre;
    private double numeroPalabras=0;
    
    public abstract void show();


    public Component(String nombre) {
        this.nombre = nombre;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNumeroPalabras() {
        return numeroPalabras;
    }


    public void setNumeroPalabras(double numeroPalabras) {
        this.numeroPalabras = numeroPalabras;
    }

}
