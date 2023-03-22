package ej1;

public class Espada extends Arma{

    private String material;

    public Espada(Componente componente, String material) {
        super(componente, "espada");
        this.material = material;
        this.setPuntosAtaque(getPuntosAtaque()+30);
        this.setNivel(getNivel()*2);

    }

    @Override
    public void show() {
        super.show();
        System.out.println("ARMA: "+getTipo()+" DE: "+material);
    }
    
}
