package model;

// @author Studente

public class Autore {
    
    String nome, cognome, dataNascita, indirizzo;

    public Autore(String nome, String cognome, String dataNascita, String indirizzo) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.indirizzo = indirizzo;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public String getIndirizzo() {
        return indirizzo;
    }
}
