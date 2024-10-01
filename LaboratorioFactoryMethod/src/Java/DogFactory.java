package Java;

public class DogFactory extends PetFactory{

    @Override
    public Dog createPet(){
        return new Dog();
    }

}
