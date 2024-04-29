import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    Map<Personale, ArrayList<Cane>> dizionario = new HashMap<>();

    void aggiungiadiz(Personale personale, ArrayList<Cane> cane) {
        dizionario.put(personale, cane);
    }

    ArrayList<Cane> aggiungicane() {

        Scanner s = new Scanner(System.in);
        ArrayList<Cane> listacani = new ArrayList<>();

        while (true) {
            System.out.println("Inserisci il nome del tuo cane e l'età: (Inserisci 'Esci' per uscire.)");
            String nomeCane = s.nextLine();
            if (nomeCane.equalsIgnoreCase("Esci")) {
                break;
            }
            int etaCane = s.nextInt();
            s.nextLine();

            System.out.println("Inserisci la razza e l'id: ");
            String razza = s.nextLine();
            String id = s.nextLine();

            Cane cane = new Cane(nomeCane, etaCane, razza, id);
            listacani.add(cane);
        }

        return listacani;

    }

    public static void main(String[] args) {

        Main ogg = new Main();

        Personale p1 = new Personale("Camilla", "veterinario");
        Personale p2 = new Personale("Alessia", "veterinario");
        Personale p3 = new Personale("Ludovico", "addestratore");
        Personale p4 = new Personale("Giacomo", "custode");

        System.out.println("Ciao, benvenuto nel nostro canile. Ecco il personale al tuo servizio: ");

        p1.infoPersonale();
        p2.infoPersonale();
        p3.infoPersonale();
        p4.infoPersonale();

        System.out.println("Inserisci cani da associare a " + p1.getNomeP() + " ruolo: " + p1.getRuolo());
        ogg.aggiungiadiz(p1, ogg.aggiungicane());

        System.out.println("Inserisci cani da associare a " + p2.getNomeP() + " ruolo: " + p2.getRuolo());
        ogg.aggiungiadiz(p2, ogg.aggiungicane());

        System.out.println("Inserisci cani da associare a " + p3.getNomeP() + " ruolo: " + p3.getRuolo());
        ogg.aggiungiadiz(p3, ogg.aggiungicane());

        System.out.println("Inserisci cani da associare a " + p4.getNomeP() + " ruolo: " + p4.getRuolo());
        ogg.aggiungiadiz(p4, ogg.aggiungicane());

        for (Map.Entry<Personale, ArrayList<Cane>> diz : ogg.dizionario.entrySet()) {
            Personale personaleCorrente = diz.getKey();
            ArrayList<Cane> listaCani = diz.getValue();

            System.out.println("\nCani associati a " + personaleCorrente.getNomeP() + ":");

            for (Cane canegen : listaCani) {
                canegen.descrizione_completa();
            }

        }

    }
}
