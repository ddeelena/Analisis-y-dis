package Java;

public class Dog implements Pet{
    @Override
    public void comer() {
        System.out.println("el perro come...");
    }

    @Override
    public void sonido() {
        System.out.println("El perro hace guau");
    }
}
