import java.util.Scanner;

public class Proprietario extends Pessoa{
    //Atributos
    private Garagem garagem;

    //Construtor
    public Proprietario(String nome, int idade, int cpf, String endereco, Garagem garagem) {
        super(nome, idade, cpf, endereco);
        this.garagem = garagem;
    }

    //Getters e Setters
    public Garagem getGaragem() {
        return garagem;
    }
    public void setGaragem(Garagem garagem) {
        this.garagem = garagem;
    }

    //Metodos
    public String ajustarData(Cliente cliente){
        Scanner sc = new Scanner(System.in);
        garagem.getDatasDisponiveis().removerDataLocada(cliente);
        return "Garagem removida!";
    }
}
