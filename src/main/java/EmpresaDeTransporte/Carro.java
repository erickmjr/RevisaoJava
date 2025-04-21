package EmpresaDeTransporte;

public class Carro extends Veiculo implements Manutencao{
    private String placa, modelo;

    public Carro(String placa, String modelo) throws PlacaInvalidaException {
        super(placa, modelo);
    }

    public double calcularCustoViagem(double distancia) {
        return distancia * 6;
    }

    public String realizarManutencao() {
        return "Carro realizando manutencao";
    }
}
