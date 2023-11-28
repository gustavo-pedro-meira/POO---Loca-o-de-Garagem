import java.util.ArrayList;
class Garagem {
    private int qtdVagas;
    private String localizacao;
    private ArrayList<Veiculo> veiculos;
    private DatasDisponiveis datasDisponiveis;

    public Garagem(int qtdVagas, String localizacao, DatasDisponiveis dt) {
        this.qtdVagas = qtdVagas;
        this.localizacao = localizacao;
        this.veiculos = new ArrayList<>();
        this.datasDisponiveis = dt;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }
    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public DatasDisponiveis getDatasDisponiveis() {
        return datasDisponiveis;
    }
    public void setDatasDisponiveis(DatasDisponiveis datasDisponiveis) {
        this.datasDisponiveis = datasDisponiveis;
    }

    public void adicionar(Veiculo v) {
        if (veiculos.size() < qtdVagas) {
            veiculos.add(v);
            System.out.println("Veículo " + v.getModelo() + " adicionado à garagem.");
        } else {
            System.out.println("A garagem está cheia. Não é possível adicionar mais veículos.");
        }
    }

    public void remover(Veiculo v) {
        if (veiculos.remove(v)) {
            System.out.println("Veículo " + v.getModelo() + " removido da garagem.");
        } else {
            System.out.println("Veículo " + v.getModelo() + " não encontrado na garagem.");
        }
    }

    public Veiculo buscar(String modelo) {
        for (Veiculo v : veiculos) {
            if (v.getModelo().equals(modelo)) {
                System.out.println("Veículo " + modelo + " encontrado na garagem.");
                return v;
            }
        }
        System.out.println("Veículo " + modelo + " não encontrado na garagem.");
        return null;
    }

    public void aumentarEspaco() {
        qtdVagas++;
        System.out.println("Espaço da garagem aumentado para " + qtdVagas + " vagas.");
    }
}
