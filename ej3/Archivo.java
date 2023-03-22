package ej3;

import java.util.ArrayList;
import java.util.List;

public class Archivo extends Component{
    private List<String> oraciones = new ArrayList<>();
    private String tipo; 

    public Archivo(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }
    public List<String> getOraciones() {
        return oraciones;
    }
    public void setOraciones(List<String> oraciones) {
        this.oraciones = oraciones;
    }
    public void addOracion(String oracion){
        oraciones.add(oracion);
        this.setNumeroPalabras(getNumeroPalabras()+oracion.split(" ").length);
    }

    public void remove(String oracion){
        oraciones.remove(oracion);
        this.setNumeroPalabras(getNumeroPalabras()-oracion.split(" ").length);
    }
    @Override
    public void show() {
        System.out.println("----------------------"+getNombre()+"."+tipo+"---------------------");
        oraciones.stream().forEach(a -> System.out.println(a));
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("NUMERO PALABRAS: "+this.getNumeroPalabras());
    }
    
}
