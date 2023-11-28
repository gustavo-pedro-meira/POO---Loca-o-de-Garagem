import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Testes {

    @Test
    void buscarGaragem() {
        //Instancias
        DatasDisponiveis calendarioPassagem = new DatasDisponiveis();
        Garagem garagemPassagem = new Garagem(3,"Rua Campo, 20", calendarioPassagem);
        Veiculo carro = new Veiculo("BMW", "BMX7", 2019);
        Cliente cliente = new Cliente("Gustavo", 19,123456422, "Tataíra, Desterro - PB",carro);

        String resultado = cliente.buscarGaragem(garagemPassagem);
        assertEquals(resultado, "Localização: " + garagemPassagem.getLocalizacao());
    }

    @Test
    void ajustarData(){
        DatasDisponiveis calendarioPassagem = new DatasDisponiveis();
        Garagem garagemPassagem = new Garagem(3,"Rua Campo, 20", calendarioPassagem);
        Proprietario proprietario = new Proprietario("José Victor", 20,106225356,"Passagem-PB", garagemPassagem);
        Veiculo carro = new Veiculo("BMW", "BMX7", 2019);
        Cliente cliente = new Cliente("Gustavo", 19,123456422, "Tataíra, Desterro - PB",carro);

        String resultado = proprietario.ajustarData(cliente);
        assertEquals(resultado, "Garagem removida!");
    }
}