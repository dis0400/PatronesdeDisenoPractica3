package ej1;

public class Decorator implements Componente {

    private Componente componente;



    public Decorator(Componente componente) {
        this.componente = componente;
    }



    @Override
    public void show() {
        componente.show();
    }



    public Componente getComponente() {
        return componente;
    }



    public void setComponente(Componente componente) {
        this.componente = componente;
    }



    @Override
    public int getNivel() {
        return componente.getNivel();
    }



    @Override
    public double getPorcentajeArmadura() {
        return componente.getPorcentajeArmadura();
    }



    @Override
    public double getPuntosAtaque() {
        return componente.getPuntosAtaque();
    }



    @Override
    public double getPuntosDefensa() {
        return componente.getPuntosDefensa();
    }



    @Override
    public double getPuntosRegeneracionVida() {
        return componente.getPuntosRegeneracionVida();
    }



    @Override
    public void setNivel(int nivel) {
        componente.setNivel(nivel);
        
    }



    @Override
    public void setPorcentajeArmadura(double porcentajeArmadura) {
        componente.setPorcentajeArmadura(porcentajeArmadura);
    }



    @Override
    public void setPuntosAtaque(double puntosAtaque) {
        componente.setPuntosAtaque(puntosAtaque);
    }



    @Override
    public void setPuntosDefensa(double puntosDefensa) {
        componente.setPuntosDefensa(puntosDefensa);
        
    }



    @Override
    public void setPuntosRegeneracionVida(double puntosRegeneracionVida) {
        componente.setPuntosRegeneracionVida(puntosRegeneracionVida);
        
    }
    
}
