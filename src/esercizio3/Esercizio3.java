package esercizio3;

import java.util.HashMap;
import java.util.Set;

public class Esercizio3 {
    protected HashMap<String, String> rubrica;

    public Esercizio3() {
        rubrica = new HashMap<>();
    }

    public void inserisciCoppia(String nome, String tel){
        rubrica.put(nome, tel);
    }

    public void cancellaCoppia(String nome){
        rubrica.remove(nome);
    }

    public String cercaPersona(String tel){
        Set<String> chiaviNomi = rubrica.keySet();

        for (String nome : chiaviNomi) {
            if(rubrica.get(nome).equals(tel)){
                return nome;
            }

        }
        return null;

    }




    public String cercaTel(String nome) {
        return rubrica.get(nome);
    }


    public void stampaRubrica(){
        for (String nome : rubrica.keySet()) {
            System.out.println("Nome: " + nome + ", Tel.: " + rubrica.get(nome));
        }
    }



}
