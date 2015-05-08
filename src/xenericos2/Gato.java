/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xenericos2;

/**
 *
 * @author Alex Urcera
 */
public class Gato extends Animal {

    private String nome = "";

    public Gato() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Gato(String tipo, String n) {
        super(tipo);
        nome = n;
    }

    @Override
    public String toString() {
        return "Gato{" +"Tipo= "+ super.tipo+"nome=" + nome + '}';
    }

   

}
