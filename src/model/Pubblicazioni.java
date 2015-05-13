package model;

// @author Studente

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class Pubblicazioni {
    
    ArrayList<String> listaautori;
    HashSet<String> listaautorico = new HashSet<>();
    ArrayList<Autore> autori = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();
    HashMap<String,ArrayList<String>> h = new HashMap<>();
    
    public void readPubblicazioni(String filename){
        try {
            Scanner sc = new Scanner(new File(filename));
            while(sc.hasNextLine()) {
                listaautori = new ArrayList<>();
                String[] tmp = sc.nextLine().split(";");
                String name = tmp[0];
                for (String split : tmp[1].split(",")) {
                    listaautori.add(split);
                    listaautorico.add(split);
                }
                names.add(name);
                h.put(name, listaautori);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File '" + filename + "' non trovato!");
        }
    }
    
    public void readInfo(){
        for(String c : listaautorico) {
            String filename = c + ".csv";
            try {
                Scanner sc = new Scanner(new File("data/" + filename));
                while(sc.hasNextLine()) {
                    String[] tmp = sc.nextLine().split(";");
                    Autore a = new Autore(tmp[0],tmp[1],tmp[2],tmp[3]);
                    autori.add(a);
                }
            } catch (FileNotFoundException ex) {
                System.out.println("File '" + filename + "' non trovato!");
            }
        } 
    }
    
    public void printTitles(){
        System.out.println("TITOLI DELLE RIVISTE:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
    
    public void printAuthors(){
        System.out.println("AUTORI:");
        for (int i = 0; i < autori.size(); i++) {
            System.out.println("Nome: " + autori.get(i).getNome());
            System.out.println("Cognome: " + autori.get(i).getCognome());
            System.out.println("Data di nascita: " + autori.get(i).getDataNascita());
            System.out.println("Indirizzo: " + autori.get(i).getIndirizzo());
        }
    }
    
    public void printAuthorAndMagazine(String nomeRivista){
        System.out.println("Autori di '" + nomeRivista + "':");
        for (int i = 0; i < h.get(nomeRivista).size(); i++) {
            System.out.println(h.get(nomeRivista).get(i));
        }
    }
    
    
}
