package ej1;

public class Escopeta extends Arma {
    private double municion;

    public Escopeta(Componente componente) {
        super(componente, "escopeta");
        municion = 30;
        this.setPuntosAtaque(getPuntosAtaque()+30);
        this.setNivel(getNivel()*2);
    } 

    @Override
    public void show() {
        super.show();
        System.out.println("ARMA: "+getTipo()+" MUNICION: "+municion);
    }
    
}
