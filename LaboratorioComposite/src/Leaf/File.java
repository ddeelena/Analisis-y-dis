package Leaf;

import ComponentInterface.FileComponent;

public class File implements FileComponent {

    private String nameFile; //Variable en donde se almacena el nombre del archivo


    // constructor del archivo, en donde se asigna el nombre del mismo.
    public File(String nameFile) {
        this.nameFile = nameFile;
    }


    // Nos permite obtener el nombre del archivo
    public String getName() {
        return nameFile;
    }


    //Imprimi los detalles del archivo
    @Override
    public void showDetails() {
        System.out.println("        Archivo: "+ nameFile);
    }

}
