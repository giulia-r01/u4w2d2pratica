package Esercizio3;

import java.util.Scanner;

public class MainEsercizio3 {
    public static void main(String[] args) {

        Esercizio3 rubrica = new Esercizio3();

        rubrica.inserisciCoppia("Gianni", "3456723461");
        rubrica.inserisciCoppia("TopoGigio", "3386235492");
        rubrica.inserisciCoppia("Al Bano", "3452873191");
        rubrica.inserisciCoppia("Nanni Moretti", "3208157642");
        rubrica.inserisciCoppia("Gianni Morandi", "3288147242");

        System.out.println("Rubrica di Giorgione");
        rubrica.stampaRubrica();

        String numeroTopoGigio = rubrica.cercaTel("TopoGigio");
        System.out.println("\nNumero di TopoGigio: " + (numeroTopoGigio != null ? numeroTopoGigio : "Numero non trovato"));

        String nomeTrovato = rubrica.cercaPersona("3452873191");
        System.out.println("A chi corrisponde il numero 3452873191? " + (nomeTrovato != null ? nomeTrovato : "Nessuna corrispondenza"));

        rubrica.cancellaCoppia("Gianni Morandi");

        System.out.println("\nRubrica aggiornata:");
        rubrica.stampaRubrica();

    }
}
