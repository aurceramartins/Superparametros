package xenericos2;

/**
 *
 * @author Alex Urcera
 */
public class Can extends Animal {

    private String nome = "";

    public Can() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Can(String tipo, String n) {
        super(tipo);
        nome = n;
    }

}
