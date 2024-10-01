package Java;

public class CatFactory extends PetFactory {

    @Override
    public Pet createPet() {
        return new Cat();
    }

}
