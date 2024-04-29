

public class Cane extends Animale {

    String nome;
    int eta;
    String razza;
    String id;

    public Cane(String nome, int eta, String razza, String id) {

        super(nome, eta, "cane");
        this.razza = razza;
        this.id = id;

    }

    public String getRazza() {
        return razza;
    }

    // public String getId(ArrayList<Cane> lista) {
       
    //     for (Cane cane : lista) {
    //         if (cane.getId().equals(id)) {
    //         return id;
    //     } 
    // }
    // }

    public String getId() {
        return id;
    }

    public void descrizione_completa() {
        super.descrizione();
        System.out.println(", razza: " + getRazza() + ", id: " + getId());
    }

}
