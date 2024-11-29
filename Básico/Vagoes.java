public class Vagoes{
private int idvagao;
private int capmax=10;
private int idtrem;


public Vagoes(int idvagao,int capmax,int idtrem){
this.idvagao=idvagao;
this.capmax=capmax;
this.idtrem=idtrem;

}


public int getIdvagao() {
    return idvagao;
}


public void setIdvagao(int idvagao) {
    this.idvagao = idvagao;
}


public int getCapmax() {
    return capmax;
}


public void setCapmax(int capmax) {
    this.capmax = capmax;
}


public int getIdtrem() {
    return idtrem;
}


public void setIdtrem(int idtrem) {
    this.idtrem = idtrem;
}


@Override
public String toString() {
    return "Vagoes [idvagao=" + idvagao + ", capmax=" + capmax + ", idtrem=" + idtrem + "]";
}



}