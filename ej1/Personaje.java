package ej1;

public class Personaje implements Componente{
    private String nombre;
    private int nivel;
    private double porcentajeArmadura;
    private double puntosAtaque;
    private double puntosDefensa;
    private double puntosRegeneracionVida;

    

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.porcentajeArmadura = 1;
        this.puntosAtaque = 1;
        this.puntosDefensa = 1;
        this.puntosRegeneracionVida = 1;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getNivel() {
        return nivel;
    }



    public void setNivel(int nivel) {
        this.nivel = nivel;
    }



    public double getPorcentajeArmadura() {
        return porcentajeArmadura;
    }



    public void setPorcentajeArmadura(double porcentajeArmadura) {
        this.porcentajeArmadura = porcentajeArmadura;
    }



    public double getPuntosAtaque() {
        return puntosAtaque;
    }



    public void setPuntosAtaque(double puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }



    public double getPuntosDefensa() {
        return puntosDefensa;
    }



    public void setPuntosDefensa(double puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }



    public double getPuntosRegeneracionVida() {
        return puntosRegeneracionVida;
    }



    public void setPuntosRegeneracionVida(double puntosRegeneracionVida) {
        this.puntosRegeneracionVida = puntosRegeneracionVida;
    }



    @Override
    public void show() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("NOMBRE: "+nombre+" NIVEL: "+nivel);
        System.out.println("PORCENTAJE ARMADURA: "+porcentajeArmadura);
        System.out.println("PUNTOS:");
        System.out.println("ATAQUE - "+puntosAtaque);
        System.out.println("DEFENSA - "+puntosDefensa);
        System.out.println("REGENERACION DE VIDA - "+puntosRegeneracionVida);
    }
    
}
