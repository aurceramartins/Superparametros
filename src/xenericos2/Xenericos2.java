package xenericos2;

public class Xenericos2 {

    public static void main(String[] args) {

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

        can.amosar();
        gato.amosar();
        cabalo.amosar();
    }

}
