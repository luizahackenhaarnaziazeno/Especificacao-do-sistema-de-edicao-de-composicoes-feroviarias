import java.util.ArrayList;

public class GaragemLocomotiva {
private ArrayList<Locomotiva>locomotivas;// Declaração do atributo para armazenar locomotivas como uma lista de objetos Locomotiva
private int proxLivre;// Variável para acompanhar a próxima posição livre na lista de locomotivas
private ArrayList<GaragemTrem>garagemtrem;//Declaração do atributo para armazenar garargemtrem como uma lista de objetos garagemtrem.


public GaragemLocomotiva(ArrayList<Locomotiva> locomotivas, int proxLivre) {
    this.locomotivas = locomotivas;
    this.proxLivre = proxLivre;
}



// Método para estacionar uma locomotiva na garagem
public boolean estacionaLocomotiva(Locomotiva l){
locomotivas.add(l);// Adiciona a locomotiva à lista de locomotivas
proxLivre++; // Incrementa o contador de próxima posição livre
return true;
}




public void setProxLivre(int proxLivre) {// Setter para a próxima posição livre
    this.proxLivre = proxLivre;
}


public Locomotiva setIdLocomotiva(int id){// Método para procurar uma locomotiva pelo seu ID
for(Locomotiva l:locomotivas){// Itera sobre a lista de locomotivas
if(l.getIdlocomotiva()==id){// Verifica se o ID da locomotiva atual é igual ao ID fornecido
return l; // Se encontrar uma correspondência, retorna a locomotiva   
}    
}    
return (null);// Se não encontrar correspondência, retorna null
}

public ArrayList<Locomotiva>gettoLocomotiva(){// Método para obter a lista de locomotivas
return locomotivas;    
}

public Locomotiva getIdlocomotiva(){
    for(Locomotiva l:locomotivas){//Para cada Locomotiva na lista de locomotivas.
     l.getIdlocomotiva();//Chama o método getIdLocomotiva() para cada locomotiva na lista.    
        }
    return null;//Retorna null
    
}

public Locomotiva RetiraLocomotiva(int id){// Método para retirar uma locomotiva da garagem pelo seu ID
for(int i=0;i<locomotivas.size();i++){// Itera sobre a lista de locomotivas
if(locomotivas.get(i).getIdlocomotiva()==id){;// Verifica se o ID da locomotiva atual é igual ao ID fornecido
return locomotivas.remove(i);// Se encontrar uma correspondência, remove a locomotiva da lista 
}    
}
// Se não encontrar correspondência, retorna null
return null;
}

// Método para listar os vagões não utilizados
public void listarLocomotivasLivres() {
    System.out.println("Locomotivas não utilizados na composição de nenhum trem:");
    for (Locomotiva locomotivas: locomotivas) {
        // Verifica se a locomotiva não foi utilizado na composição de nenhum trem
        if (!foiUtilizado(locomotivas)) {
            System.out.println(locomotivas.toString());
        }
    }
}

// Método privado para verificar se uma locomotiva foi utilizada na composição de algum trem
private boolean foiUtilizado(Locomotiva locomotivas) {
    // Itera sobre os trens na garagem de trens
    for (GaragemTrem gt : garagemtrem) {
        gt.listarTrens();
        // Verifica se a locomotiva está presente na composição do trem
        if (gt.listarTrens()==gt.getIdTrem()) {
            return true; // Retorna true se a locomotiva foi utilizado em algum trem
        }
    }
    return false; // Retorna false se a locomotiva não foi utilizado em nenhum trem
}

@Override
public String toString() {
    return "GaragemLocomotiva [locomotivas=" + locomotivas + ", proxLivre=" + proxLivre + "]";
}

}


