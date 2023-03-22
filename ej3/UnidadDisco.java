package ej3;

import java.util.ArrayList;
import java.util.List;

public class UnidadDisco extends Component{
    private List<Component> folders = new ArrayList<>();

    public UnidadDisco(String nombre) {
        super(nombre);
    }

    public void addFolder(Folder folder){
       folders.add(folder);
        this.setNumeroPalabras(getNumeroPalabras()+folder.getNumeroPalabras());
    }

    public void removeFolder(Folder folder){
        folders.remove(folder);
        this.setNumeroPalabras(getNumeroPalabras()-folder.getNumeroPalabras());
    }

    @Override
    public void show() {
        System.out.println("--------------------UNIDAD DE DISCO: "+getNombre()+"------------------");
        System.out.println("NUMERO DE PALABRAS: "+getNumeroPalabras());
        System.out.println("FOLDERS:");
        folders.stream().forEach(a -> a.show());
    }
    
}
