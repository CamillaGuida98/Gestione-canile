
class Personale {
    private String nomeP;
    private String ruolo;

    public Personale(String nomeP, String ruolo) {
        this.nomeP = nomeP;
        this.ruolo = ruolo;
    }

    public String getNomeP() {
        return nomeP;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public void infoPersonale() {
        System.out.println(getNomeP() + " ricopre il ruolo di: " + getRuolo());
    }
}
