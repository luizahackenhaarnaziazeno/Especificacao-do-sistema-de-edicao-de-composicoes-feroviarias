import java.util.ArrayList;

public class GaragemVagoes {
private ArrayList<Vagoes>vagoes;// Declaração do atributo para armazenar vagões como uma lista de objetos vagões.
private int proxLivre;// Variável para acompanhar a próxima posição livre na lista de vagões
private ArrayList<GaragemTrem>garagemtrem;//Declaração do atributo para armazenar garargemtrem como uma lista de objetos garagemtrem.
private ArrayList<GaragemLocomotiva>garagemlocomotiva;// Declaração do atributo para armazenar garagemlocomotiva como uma lista de objetos garagemlocomotiva.

public GaragemVagoes(ArrayList<Vagoes> vagoes, int proxLivre) {
    this.vagoes = vagoes;
    this.proxLivre = proxLivre;
}

// Método para estacionar uma vagões na garagem
public void estacionaVagoes(Vagoes v){
for(GaragemLocomotiva gl:garagemlocomotiva){
if(gl.estacionaLocomotiva(null)){
    System.out.println("O Vagão não pode ser inserido,pois não há uma locomotiva");
    }else{
vagoes.add(v);// Adiciona a vagões à lista de locomotivas
proxLivre++; // Incrementa o contador de próxima posição livre
}
}
}

public void setProxLivre(int proxLivre) {// Setter para a próxima posição livre
    this.proxLivre = proxLivre;
}


public Vagoes setIdVagoes(int id){// Método para procurar um vagão pelo seu ID
for(Vagoes v:vagoes){// Itera sobre a lista de vagões
if(v.getIdvagao()==id){// Verifica se o ID do vagão atual é igual ao ID fornecido
return v; // Se encontrar uma correspondência, retorna o vagão  
}    
}    
return (null);// Se não encontrar correspondência, retorna null
}

public ArrayList<Vagoes>gettoVagoes(){// Método para obter a lista de vagões
return vagoes;    
}

public Vagoes getIdvagao(){
    for(Vagoes v:vagoes){//Para cada vagão na lista de vagões.
     v.getIdvagao();//Chama o método getIdvagao() para cada vagão na lista.    
        }
    return null;//Retorna null
    
}


public Vagoes RetiraVagoes(int id){// Método para retirar um vagão da garagem pelo seu ID
for(int i=0;i<vagoes.size();i++){// Itera sobre a lista de vagões
if(vagoes.get(i).getIdvagao()==id){;// Verifica se o ID do vagão atual é igual ao ID fornecido
return vagoes.remove(i);// Se encontrar uma correspondência, remove o vagão da lista
}    
}
// Se não encontrar correspondência, retorna null
return null;
}

// Método para listar os vagões não utilizados
public void listarVagoesLivres() {
    System.out.println("Vagões não utilizados na composição de nenhum trem:");
    for (Vagoes vagoes : vagoes) {
        // Verifica se o vagão não foi utilizado na composição de nenhum trem
        if (!foiUtilizado(vagoes)) {
            System.out.println(vagoes.toString());
        }
    }
}

// Método privado para verificar se um vagão foi utilizado na composição de algum trem
private boolean foiUtilizado(Vagoes vagoes) {
    // Itera sobre os trens na garagem de trens
    for (GaragemTrem gt : garagemtrem) {
        gt.listarTrens();
        // Verifica se o vagão está presente na composição do trem
        if (gt.listarTrens()==gt.getIdTrem()) {
            return true; // Retorna true se o vagão foi utilizado em algum trem
        }
    }
    return false; // Retorna false se o vagão não foi utilizado em nenhum trem
}



@Override
public String toString() {
    return "GaragemVagoes [vagoes=" + vagoes + ", proxLivre=" + proxLivre + "]";
}


}



