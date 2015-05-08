package xenericos2;

import java.util.ArrayList;

/**
 *
 * @author Alex Urcera
 */
public class ColeccionsXenericos<E> {

    ArrayList<E> gatocan = new ArrayList<>();

    public void engadir(E elemento) {
        gatocan.add(elemento);

    }

    public void amosar() {
        for (E gatocan1 : gatocan) {
            System.out.println(gatocan1);
        }
    }
}
