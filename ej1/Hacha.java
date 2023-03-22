package ej1;

public class Hacha extends Arma {
    private String punta;

    public Hacha(Componente componente, String punta) {
        super(componente, "hacha");
        this.punta = punta;
        this.setPuntosAtaque(getPuntosAtaque()+30);
        this.setNivel(getNivel()*2);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("ARMA: "+getTipo()+" PUNTA: "+punta);
    }
    
}
