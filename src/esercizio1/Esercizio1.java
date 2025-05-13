package esercizio1;


import java.util.HashSet;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di stringhe da inserire: ");
        int numeroElementi = scanner.nextInt();
        scanner.nextLine();

        HashSet<String> paroleDistinte = new HashSet<>();
        HashSet<String> paroleDuplicate = new HashSet<>();

        for (int i = 0; i < numeroElementi; i++) {

            System.out.println("Inserisci la parola #" + (i+1) + ": ");
            String parola = scanner.nextLine();

            if(!paroleDistinte.add(parola)){
                paroleDuplicate.add(parola);
            }

        }

        System.out.println("\nRisultati:");

        if (!paroleDistinte.isEmpty()){
            System.out.println("Parole duplicate: ");

            for (String parola : paroleDuplicate) {
                System.out.println("- " + parola);

            }
        }else {
            System.out.println("Non ci sono parole duplicate");
        }


        System.out.println("\nParole distinte: " + paroleDistinte.size());

        for (String parola : paroleDistinte) {
            System.out.println("- " + parola);

        }

        scanner.close();

    }

}
