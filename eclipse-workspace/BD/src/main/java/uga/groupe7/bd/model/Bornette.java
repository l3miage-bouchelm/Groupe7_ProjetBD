package uga.groupe7.bd.model;

public class Bornette {

    private int idBorne;
    private Etat etatBorne;

    public enum Etat{
        OK,
        HS
    }
    public Bornette(int idBorne, Etat etatBorne){
        this.idBorne=idBorne;
        this.etatBorne=etatBorne;
    }


}
