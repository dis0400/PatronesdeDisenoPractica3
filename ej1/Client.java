package ej1;

public class Client {
    public static void main(String[] args) {
        Componente a = new Personaje("Luis Miguel");
        
        a.show();

        a = new Escopeta(a);

        a.show();

        a = new Escudo(a,"obsidiana");

        a.show();
        
        a = new PocionCuracion(a);

        a.show();
    }
}
