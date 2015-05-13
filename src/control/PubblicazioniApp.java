package control;

// @author Studente

import java.util.Scanner;
import model.Pubblicazioni;


public class PubblicazioniApp {
    public static void main(String[] args) {
        
        Pubblicazioni p = new Pubblicazioni();
        Scanner lettore = new Scanner(System.in);
        
        p.readPubblicazioni("data/pubblicazioni.csv");
        p.readInfo();

        while(true) {
            System.out.println("Premi '1' per leggere tutti i titoli delle riviste...");
            System.out.println("Premi '2' per leggere le informazioni degli autori...");
            System.out.println("Premi '3' per leggere gli autori di una rivista specifica...");
            System.out.println("Premi '4' per uscire dall'applicazione...");
            System.out.print("Premi ora:  ");
            int i = lettore.nextInt();
            switch (i) {
                case 1:   
                    p.printTitles();
                    break;
                case 2:
                    p.printAuthors();
                    break;
                case 3:
                    Scanner lettore1 = new Scanner(System.in);
                    System.out.println("Immettere il nome della speicifa rivista");
                    String rivista = lettore1.nextLine();
                    String output = rivista.substring(0,1).toUpperCase() + rivista.substring(1, rivista.length()).toLowerCase();
                    p.printAuthorAndMagazine(output);
                    break;    
                case 4:   
                    System.exit(1);
            }        
        }
        
    }
}
