package xenericos2;

import java.util.ArrayList;

public class Xenericos2 {

    public static void main(String[] args) {
        ColeccionsXenericos<Animal> aux = new ColeccionsXenericos<>();
        ColeccionsXenericos<Can> can = new ColeccionsXenericos<>();
        can.engadir(new Can("Can", "brisa"));
        can.engadir(new Can("Can", "paa"));
        can.engadir(new Can("Can", "pbb"));
        ColeccionsXenericos<Gato> gato = new ColeccionsXenericos<>();
        gato.engadir(new Gato("Gato", "g11"));
        gato.engadir(new Gato("Gato", "g22"));
        gato.engadir(new Gato("Gato", "g33"));
        ColeccionsXenericos<Cabalo> cabalo = new ColeccionsXenericos<>();
        cabalo.engadir(new Cabalo("ballo"));
        cabalo.engadir(new Cabalo("perdigon"));
        cabalo.engadir(new Cabalo("mula"));
        ArrayList<Can> caos = new ArrayList<>();
        ArrayList<Cabalo> ballos = new ArrayList<>();

        can.amosar();
        gato.amosar();
        cabalo.amosar();

        //Anhadimos un arraylist de tipo can a un arraylist de tipo animal ya que en el metodo amosarcomodin le pusimos un ? y permite recibir calquera tipo.
        caos.add(new Can("Prex", "can"));
        aux.amosarComodin(caos);
        ballos.add(new Cabalo("Prex"));
        aux.amosarCom(caos);
        aux.amosarCom(ballos);
        
        
        ArrayList<Balea>balea=new ArrayList<>();
        balea.add(new Balea("Willy"));
        balea.add(new Balea(5));
        balea.add(new Balea(5.5));
        aux.amosarCom(balea);

    }

}
