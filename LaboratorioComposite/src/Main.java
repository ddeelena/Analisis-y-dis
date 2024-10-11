import CompositeClass.Folder;
import Leaf.File;

public class Main {
    public static void main(String[] args) {

        // Creo una nueva carpeta
        Folder folderAnalisis = new Folder("Analisis y diseño");


        // Creo los archivos que guardare en la carpeta anterior
        File fileC = new File("Guia Teorica- Practica: Patron de diseño composite");
        File fileB = new File("Guia Teorica- Practica: Patron de diseño bridge");


        // guardo los archivos en la carpeta que cree
        folderAnalisis.add(fileB);
        folderAnalisis.add(fileC);


        // muestro los detalles de la carpeta
        folderAnalisis.showDetails();


        //Creo otra carpeta
        Folder folderIndustrial = new Folder("Aduanas");

        // Creo otro archivo
        File fileP = new File("Pruebas");

        // guardo el archivo en la carpeta
        folderIndustrial.add(fileP);

        // muestro los detalles de la carpeta
        folderIndustrial.showDetails();

        // creo una tercera carpeta
        Folder folderSextoSemestre = new Folder("6to smestre");

        // guardo las dos primeras crapetas en la carpeta  folderSextoSemestre que cree anteriormente
        // para convertirla en una super carpeta
        folderSextoSemestre.add(folderAnalisis);
        folderSextoSemestre.add(folderIndustrial);

        // muestro los detalles, y como tiene dos carpetas me muestra incluso lo que contienen estas
        folderSextoSemestre.showDetails();

        // Borro el archivo fileB de la primera carpeta
        folderAnalisis.delete(fileB);

        // muestro nuevamente los detalles para comprobar que se borro
        folderAnalisis.showDetails();
    }
}