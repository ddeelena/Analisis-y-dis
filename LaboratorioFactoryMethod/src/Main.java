import Java.CatFactory;
import Java.DogFactory;
import Java.Pet;
import Java.PetFactory;

public class Main {
    public static void main(String[] args) {

        PetFactory dogFactory = new DogFactory();
        Pet dog = dogFactory.createPet();
        dog.sonido();

        PetFactory catFactory = new CatFactory();
        Pet cat = catFactory.createPet();
        cat.sonido();

    }
}