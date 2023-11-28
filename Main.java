public class Main{
    public static void main(String[] args){
        //Objeto que Proprietario deve ter
        DatasDisponiveis calendarioPassagem = new DatasDisponiveis();
        Garagem garagemPassagem = new Garagem(3,"Rua Campo, 20", calendarioPassagem);
        Proprietario proprietario = new Proprietario("José Victor", 20,106225356,"Passagem-PB", garagemPassagem);
        Usuario administrador = new Usuario(proprietario,"Iphone 8 plus");

        //Objetos que Cliente deve ter
        Veiculo carro = new Veiculo("BMW", "BMX7", 2019);
        Cliente cliente = new Cliente("Gustavo", 19,123456422, "Tataíra, Desterro - PB",carro);
        Usuario usuario = new Usuario(cliente,"Samsung A20");

        //Metodos
        cliente.buscarGaragem(garagemPassagem);
        cliente.locarGaragem(garagemPassagem);

        proprietario.ajustarData(cliente);

        calendarioPassagem.verificarDataLocada(cliente);

        System.out.println(garagemPassagem.getQtdVagas());


    }
}
