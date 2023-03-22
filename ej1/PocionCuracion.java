package ej1;

public class PocionCuracion extends Pocion {

    public PocionCuracion(Componente componente) {
        super(componente, "curacion");
        this.setPuntosRegeneracionVida(getPuntosRegeneracionVida()+80);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("POCION DE CURACION");
    }
    
}
