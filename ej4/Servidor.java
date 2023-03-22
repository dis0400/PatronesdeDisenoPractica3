package ej4;

public class Servidor implements IServidor {
    public Servidor(int numero) {
        this.numero = numero;
    }

    private int numero;

    @Override
    public void login(String usuario, String password) {
        throw new UnsupportedOperationException("NO SE PUEDE REALIZAR ESTA OPERACION");
    }

    @Override
    public void login(Usuario usuario) {
        System.out.println("--------------------SERVIDOR"+numero+"---------------------");
        System.out.println("ATENDIENDO A USUARIO:");
        usuario.show();
    }
    
}
