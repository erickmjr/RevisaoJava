package EmpresaDeTransporte;

public class Caminhao extends Veiculo implements Manutencao{
    private String placa, modelo;

    public Caminhao(String placa, String modelo) throws PlacaInvalidaException {
        super(placa, modelo);
    }

    public double calcularCustoViagem(double distancia) {
        return distancia * 9;
    }

    public String realizarManutencao() {
        return "Caminhao realizando manutencao";
    }
}
