package uga.groupe7.bd.model;
import java.sql.Date;

public class Location {
    private int idVelo;
    private int numCB; 
    private Date debut;
    private Date fin;
    private int codeSecret;
    public Location(int idVelo, int numCB, Date debut, Date fin, int codeSecret){
         this.idVelo=idVelo;
         this.numCB=numCB;
         this.debut=debut;
         this.fin=fin;
         this.codeSecret=codeSecret;

     }
}
