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
        Scanner s3 = new Scanner(System.in);
        ArrayList<Cane> listacani = new ArrayList<>();

        while (true) {
            System.out.println("Inserisci il nome del tuo cane e l'età: (Inserisci 'Esci' per uscire.)");
            String nomeCane = s.nextLine();

            if (nomeCane.equalsIgnoreCase("Esci")) {
                break;
            }
            int etaCane = s3.nextInt();

            System.out.println("Inserisci la razza: ");
            String razza = s.nextLine();

            Cane cane = new Cane(nomeCane, etaCane, razza);
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

        Scanner s2 = new Scanner(System.in);
        boolean j = true;

        while (j) {
            System.out.println("premi:\n1 per aggiungere cani a " + p1.getNomeP() + "\n2 per aggiungere cani a "
                    + p2.getNomeP() + "\n3 per aggiungere cani a " + p3.getNomeP() + "\n4 per aggiungere cani a "
                    + p4.getNomeP() + "\n5 per uscire e visualizza");
            int scelta = s2.nextInt();
            s2.nextLine();
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci cani da associare a " + p1.getNomeP() + " ruolo: " + p1.getRuolo());
                    ogg.aggiungiadiz(p1, ogg.aggiungicane());
                    break;
                case 2:
                    System.out.println("Inserisci cani da associare a " + p2.getNomeP() + " ruolo: " + p2.getRuolo());
                    ogg.aggiungiadiz(p2, ogg.aggiungicane());
                    break;
                case 3:
                    System.out.println("Inserisci cani da associare a " + p3.getNomeP() + " ruolo: " + p3.getRuolo());
                    ogg.aggiungiadiz(p3, ogg.aggiungicane());
                    break;
                case 4:

                    System.out.println("Inserisci cani da associare a " + p4.getNomeP() + " ruolo: " + p4.getRuolo());
                    ogg.aggiungiadiz(p4, ogg.aggiungicane());
                    break;
                case 5:
                    System.out.println("ecco la lista:");
                    j = false;
                    break;

                default:
                    System.out.println("metti un numero da 1 a 5");
                    break;
            }
            
        }

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
