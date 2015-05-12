package xenericos2;

/**
 *
 * @author Alex Urcera
 */
public class Balea<T> {

    T dato;

    public Balea(T valor) {
        dato = valor;
    }

    public Balea() {
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Balea{" + "dato=" + dato + '}';
    }

}
