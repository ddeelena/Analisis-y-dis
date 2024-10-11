package CompositeClass;

import ComponentInterface.FileComponent;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent {

    // variable donde se almacena el nombre de la crapeta
    private String nameFolder;

    // Lista en donde se almacenan los archivos o carpetas de cada carpeta
    private List<FileComponent> file = new ArrayList<>();


    // Constructor de la carpeta, en donde se guarda el nombre de la misma.
    public Folder(String nameFolder) {
        this.nameFolder = nameFolder;
    }


    // Permite obtener el nombre de la carpeta
    public String getName() {
        return nameFolder;
    }

    // Muestra los detalles de la carpeta, incluyendo los archivos y carpetas que contiene
    @Override
    public void showDetails() {
        System.out.println("Carpeta: "+nameFolder);
        for (FileComponent file: file) {
            file.showDetails();
        }
    }


    // Funcion que permite añadir un nuevo elemento a la carpeta
    public void add(FileComponent file){
        this.file.add(file);
        System.out.println("Se añadio "+ file.getName());
    }


    // Funcion que permite borrar un elemento de la carpeta
    public void delete(FileComponent file){
        this.file.remove(file);
        System.out.println("Se elimino "+ file.getName());
    }
}
