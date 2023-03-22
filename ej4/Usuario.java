package ej4;
import java.util.regex.Pattern;

public class Usuario {
    private String nombre;
    private String password;
    private int numero;
    
    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.setPassword(password);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(isValidPassword(password)){
            this.password = password;
        } else{
            System.out.println("INTRODUZCA OTRA CONTRASEÑA");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    private boolean isValidPassword(String password){
        return Pattern.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$", password);
    }

    public void show(){
        System.out.println("NOMBRE: "+nombre);
        System.out.println("NUMERO: "+numero);
    }
}
