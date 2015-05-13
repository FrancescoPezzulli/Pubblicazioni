package model;

// @author Studente

public class Rivista {
    
    String nome;
    String[] autori;

    public Rivista(String nome, String[] autori) {
        this.nome = nome;
        this.autori = autori;
    }

    public String getNome() {
        return nome;
    }

    public String[] getAutori() {
        return autori;
    }
    
    
    
}
