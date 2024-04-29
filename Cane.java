import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public class Cane extends Animale {

    String nome;
    int eta;
    String razza;
    String id;
    private static ArrayList<String> idGenerati = new ArrayList<>();

    public Cane(String nome, int eta, String razza) {

        super(nome, eta, "cane");
        this.razza = razza;
        this.id = generaID();

    }

    public String getRazza() {
        return razza;
    }

    private String generaID() {
        Random random = new Random();
        int numeroCasuale = random.nextInt(9000) + 1000;

        while(idGenerati.contains(String.valueOf(numeroCasuale))){

            //inserire un try per controllare che la lunghezza lista sia <9999
            numeroCasuale = random.nextInt(9000) + 1000;

        }
        
            idGenerati.add(String.valueOf(numeroCasuale));

        return String.valueOf(numeroCasuale);
    }

    public String getId() {
        return id;
    }

    public void descrizione_completa() {
        super.descrizione();
        System.out.println(", razza: " + getRazza() + ", id: " + getId());
    }

}
