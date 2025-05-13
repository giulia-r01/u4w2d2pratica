package esercizio2;

import java.util.List;
import java.util.Scanner;

import static esercizio2.Esercizio2.*;

public class MainEsercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero:");
        int n = scanner.nextInt();

        List<Integer> listaOrdinata = generaListaCasuale(n);
        System.out.println("Lista ordinata casuale: " + listaOrdinata);

        System.out.println("---------------");

        List<Integer> listaDuplicata = duplicaConInverso(listaOrdinata);
        System.out.println("Lista duplicata con inverso: " + listaDuplicata);

        System.out.println("---------------");
        stampaPariDispari(listaDuplicata,true);
        stampaPariDispari(listaDuplicata,false);

    }
}
