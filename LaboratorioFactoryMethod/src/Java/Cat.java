package Java;

public class Cat implements  Pet{

    @Override
    public void comer() {
        System.out.println("El gato come croquetas");
    }

    @Override
    public void sonido() {
        System.out.println("El gato hace miauu");
    }
}
