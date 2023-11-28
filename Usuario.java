public class Usuario {
    //Atributos
    private Pessoa pessoa;
    private String aparelho;

    //Construtor
    public Usuario(Pessoa pessoa, String aparelho) {
        this.pessoa = pessoa;
        this.aparelho = aparelho;
    }

    //Getters e Setters
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public String getAparelho() {
        return aparelho;
    }
    public void setAparelho(String aparelho) {
        this.aparelho = aparelho;
    }
}
