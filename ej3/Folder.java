package ej3;
import java.util.ArrayList;
import java.util.List;
public class Folder extends Component{
    private List<Component> archivos = new ArrayList<>();

    public Folder(String nombre) {
        super(nombre);
    }

    public void addArchivo(Archivo archivo){
        archivos.add(archivo);
        this.setNumeroPalabras(getNumeroPalabras()+archivo.getNumeroPalabras());
    }

    public void removeArchivo(Archivo archivo){
        archivos.remove(archivo);
        this.setNumeroPalabras(getNumeroPalabras()-archivo.getNumeroPalabras());
    }

    @Override
    public void show() {
        System.out.println("-------------------- FOLDER: "+getNombre()+"------------------");
        System.out.println("NUMERO DE PALABRAS: "+getNumeroPalabras());
        System.out.println("ARCHIVOS:");
        archivos.stream().forEach(a -> a.show());
    }
    
}
