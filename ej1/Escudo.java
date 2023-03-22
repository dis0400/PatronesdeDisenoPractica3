package ej1;

public class Escudo extends Decorator{

    private String material;

    public Escudo(Componente componente, String material) {
        super(componente);
        this.material = material;
        this.setPuntosDefensa(getPuntosDefensa()+35);
        this.setPorcentajeArmadura(getPorcentajeArmadura()+10);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("ESCUDO: "+material);
    }


}
