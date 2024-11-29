import java.util.ArrayList;

public class GaragemTrem {
private static ArrayList<Trem>trem;// Declaração do atributo para armazenar trem como uma lista de objetos trem.
private int proxLivre;// Variável para acompanhar a próxima posição livre na lista de locomotivas




public GaragemTrem(ArrayList<Trem> trem, int proxLivre) {
    this.trem = trem;
    this.proxLivre = proxLivre;
}

// Método para estacionar um trem na garagem
public void estacionaTrem(Trem t){
    trem.add(t);// Adiciona a Trem à lista de locomotivas
    proxLivre++; // Incrementa o contador de próxima posição livre
    }

public int getIdTrem(){
    return getIdTrem();
}

public static  void criaTrem(int getIdLocomotiva,int getIdvagao) {
for(Trem t:trem)
System.out.println(getIdLocomotiva+getIdvagao+t.getIdTrem());
}

/*Tentativa inicial.
 * public static  void criaTrem(GaragemLocomotiva garagemlocomotiva,GaragemVagoes garagemvagoes) {
   for(Trem t:trens)
   if(garagemlocomotiva.estacionaLocomotiva()!=null){
   garagemlocomotiva.estacionaLocomotiva(null);
   garagemvagoes.estacionaVagoes(null);
   t.getIdTrem();
   }
   }
 */
public static Integer listarTrens() {
    System.out.println("Lista de IDs de todos os trens:");
    boolean tremEncontrado = false;
    for (Trem trem : trem) {
        if (trem.getIdTrem() > 0) {
            System.out.println("ID do Trem: " + trem.getIdTrem());
            tremEncontrado = true;
        }
    }
    if (tremEncontrado) {
        return 1; // Retorna qualquer valor diferente de null para indicar que os trens foram listados
    } else {
        return null; // Retorna null se nenhum trem for encontrado
    }
}

public Integer DesfazerTrens(int idvagao,int idlocomotiva,int idtrem){
return null;
}
}
