
package xenericos2;

public class Cabalo {
    
    String nome;

    public Cabalo() {
    }

    public Cabalo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    @Override
    public String toString() {
        return "Cabalo{" + "nome=" + nome + '}';
    }
    
    
}
