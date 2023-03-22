package ej4;

import java.util.HashMap;
import java.util.Map;

public class Proxy implements IServidor{
    private Map<String, Usuario> usuarios = new HashMap<>();
    private Servidor servidor1 = new Servidor(1);
    private Servidor servidor2 = new Servidor(2);
    private int numeroUsuarios=0;

    public Proxy addUsuario(Usuario usuario){
        usuario.setNumero(++numeroUsuarios);
        usuarios.put(usuario.getNombre(), usuario);
        return this;
    }

    @Override
    public void login(String usuario, String password) {
        Usuario aux = usuarios.get(usuario);
        if(aux != null){
            if(aux.getPassword().equals(password)){
                if(aux.getNumero()%2==0){
                    servidor2.login(aux);
                } else{
                    servidor1.login(aux);
                }
            } else{
                System.out.println("---------------------------------------------------");
                System.out.println("CONTRASEÑA O USUARIO INCORRECTOS");
            }
        } else{
            System.out.println("---------------------------------------------------");
            System.out.println("USUARIO INEXISTENTE");
        }
    }

    @Override
    public void login(Usuario usuario) {
        throw new UnsupportedOperationException("NO SE PUEDE REALIZAR ESTA OPERACION");
    }
    
}
