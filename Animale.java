

public abstract class Animale{

    private String nome;
    private int eta;
    private String specie;

    public Animale(String nome, int eta, String specie){

        this.nome=nome;
        this.eta=eta;
        this.specie=specie;

    }
    public String getNome(){
        return nome;
    }
    public int getEta(){
        return eta;
    }
    public String getSpecie(){
        return specie;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEtà(int eta){
        this.eta = eta;
    }
    public void setSpecie(String specie){
        this.specie = specie;
    }



    public void descrizione(){
        System.out.print("Nome: " + getNome() + ", età: " + getEta() + " anni, " + "la sua specie è: " + getSpecie());
    }

    




}