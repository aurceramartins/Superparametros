package xenericos2;

public class Animal {

    String tipo;

    public Animal() {
    }

    public Animal(String n) {
        tipo = n;
    }

    @Override
    public String toString() {
        return "Animal{" + "tipo=" + tipo + '}';
    }

}
