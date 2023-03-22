package ej1;

public abstract class Arma extends Decorator{

    private String tipo;

    public Arma(Componente componente, String tipo) {
        super(componente);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
}
