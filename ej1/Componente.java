package ej1;

public interface Componente {
    void show();
    void setNivel(int nivel);
    int getNivel();
    double getPorcentajeArmadura();
    void setPorcentajeArmadura(double porcentajeArmadura);
    double getPuntosAtaque();
    void setPuntosAtaque(double puntosAtaque);
    double getPuntosDefensa();
    void setPuntosDefensa(double puntosDefensa);
    double getPuntosRegeneracionVida();
    void setPuntosRegeneracionVida(double puntosRegeneracionVida);
}
