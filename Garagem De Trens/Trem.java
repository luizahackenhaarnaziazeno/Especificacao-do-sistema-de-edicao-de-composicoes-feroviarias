import java.util.ArrayList;


public class Trem {
    private int idtrem;
    private int proxLivre;
    private ArrayList<GaragemLocomotiva>garagemlocomotiva;// Declaração do atributo para armazenar garagemlocomotivas como uma lista de objetos Locomotiva
    private ArrayList<GaragemVagoes>garagemvagoes;// Declaração do atributo para armazenar garagemvagões como uma lista de objetos vagões.
    

     public Trem(int idtrem, int proxLivre,
    ArrayList<GaragemLocomotiva> garagemlocomotiva, ArrayList<GaragemVagoes> garagemvagoes) {
        this.idtrem = idtrem;
        this.proxLivre = proxLivre;
        this.garagemlocomotiva = garagemlocomotiva;
        this.garagemvagoes = garagemvagoes;
    }
    public int getIdTrem() {
        return idtrem;
    }
    public void setIdtrem(int idtrem) {
        this.idtrem = idtrem;
    }
    
    public static int size(){
    return Trem.size();    
    }
}
      
