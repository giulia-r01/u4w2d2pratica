package esercizio2;

import java.util.*;

public class Esercizio2 {

   public static List<Integer> generaListaCasuale(int n){
       List<Integer> lista = new ArrayList<>();
       Random r = new Random();

       for (int i = 0; i < n; i++) {
           int numero = r.nextInt(101); // genera numero tra 0 e 100
           lista.add(numero);
       }

       Collections.sort(lista); // ordina la lista in modo crescente
       return lista;
   }

   public static  List<Integer> duplicaConInverso(List<Integer> lista){
       List<Integer> nuovaLista = new ArrayList<>(lista);

       for (int i = lista.size() -1; i >=0 ; i--) {
           nuovaLista.add(lista.get(i));
       }
       return nuovaLista;
   }

   public static  void stampaPariDispari(List<Integer> lista, boolean pari){
       System.out.println(pari ? "Valori in posizione pari:": "Valori in posizione dispari");

       for (int i = 0; i < lista.size(); i++) {
           if (pari && i % 2 == 0) {
               System.out.println("Posizione " + i + ": " + lista.get(i));
           } else if (!pari && i % 2 != 0) {
               System.out.println("Posizione " + i + ": " + lista.get(i));
           }

       }
   }


}
