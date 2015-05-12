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
    //o ? e un comodin ke permite recibir calquera tipo ou obxeto.
    public void amosarComodin(ArrayList<?extends Animal>animal){
        for (int i = 0; i < animal.size(); i++) {
            System.out.println(animal.get(i));
        }
    }
    public void amosarCom(ArrayList<?>animal){
        for (int i = 0; i < animal.size(); i++) {
            System.out.println(animal.get(i));
        }
    }
    
}
