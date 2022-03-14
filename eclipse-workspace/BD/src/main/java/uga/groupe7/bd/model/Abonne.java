import java.sql.Date;

public class Abonne {
    private int codeSecret; 
    private Date dateNaissance;
    private Date dateAbonnement;
    private Sexe sexeAbonne;
    
    public enum Sexe{
        FEMME,
        HOMME
    }
    public Abonne(int codeSecret, Date dateNaissance, Date dateAbonnement, Sexe sexeAbonne){
        this.dateNaissance = dateNaissance;
        this.dateAbonnement = dateAbonnement;
        this.sexeAbonne = sexeAbonne;
        this.codeSecret = codeSecret;


    }

}