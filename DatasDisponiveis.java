import java.util.ArrayList;
import java.util.Scanner;

public class DatasDisponiveis {

    ArrayList<Cliente> datasLocadas = new ArrayList<>();

    //Metodos
    public void adicionarDataLocada(Cliente cliente){
        datasLocadas.add(cliente);
    }
    public void removerDataLocada(Cliente cliente){
        datasLocadas.remove(cliente);
    }
    public void verificarDataLocada(Cliente cliente){
        for (Cliente verDatasLocadas: datasLocadas){
            if (verDatasLocadas.getNome().equals(cliente.getNome())){
                System.out.println("Garagem está locada!");
                System.out.println("Data da locação: " + cliente.getData());
                System.out.println("Cliente que locou: " + cliente.getNome());
            }
        }
    }
}
