import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Cliente extends Pessoa{
    //Atributos
    private Veiculo veiculo;
    private String data;

    //Construtor
    public Cliente(String nome, int idade, int cpf, String endereco, Veiculo veiculo) {
        super(nome, idade, cpf, endereco);
        this.veiculo = veiculo;
    }

    //Getters e Setters
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    //Metodos
    public String buscarGaragem(Garagem garagem) {
        System.out.println("Localização: " + garagem.getLocalizacao());
        System.out.println("Quantidades de vagas: " + garagem.getQtdVagas());
        return "Localização: " + garagem.getLocalizacao();
    }

    public String locarGaragem(Garagem garagem){
        //Instancia das bibliotecas
        Scanner input = new Scanner(System.in);
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Calendar dataLocacao = Calendar.getInstance();
        Cliente thisCliente = new Cliente(getNome(), getIdade(), getCpf(),getEndereco(),getVeiculo());

        //Entradas
        System.out.println("Dia da Locação:");
        int dia = input.nextInt();
        System.out.println("Mês da Locação:");
        int mes = input.nextInt();
        System.out.println("Ano da Locação:");
        int ano = input.nextInt();


        //Adicionando a entrada para a data da Locação
        dataLocacao.set(Calendar.DAY_OF_MONTH, dia);
        dataLocacao.set(Calendar.MONTH, mes-1);
        dataLocacao.set(Calendar.YEAR, ano);

        //Imprimir a data
        System.out.println("Garagem locada!");
        System.out.println("Data da Locação: " + formatoData.format(dataLocacao.getTime()));
        data = formatoData.format(dataLocacao.getTime());

        //Adicionando ao ArrayList o veiculo
        garagem.adicionar(veiculo);
        garagem.getDatasDisponiveis().adicionarDataLocada(thisCliente);

        return "Garagem locada!";
    }
}
