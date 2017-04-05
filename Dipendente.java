
package dipendente;

public class Dipendente {
int matricola;
float stipendio;
float straordinario;

    public Dipendente(int m, float st, float str){
            matricola=m;
            stipendio=st;
            straordinario=str;
    }
    
    public float getstipendio(){return stipendio;}
    public float paga(int ore){
            return ore*straordinario+stipendio;
    }
    public void stampa(){System.out.println("Matricola "+matricola+ "Stipendio "+stipendio+"Straordinario "+straordinario);}
    
    public static void main(String[] args){
        Dipendente d= new Dipendente(1,1000,13);
        
        System.out.println(d.getstipendio());
        System.out.println(d.paga(15));
    }
}

