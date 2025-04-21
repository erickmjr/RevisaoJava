package EmpresaDeTransporte;

public class Onibus extends Veiculo implements Manutencao{
    private String placa, modelo;

    public Onibus(String placa, String modelo) throws PlacaInvalidaException {
        super(placa, modelo);
    }

    public double calcularCustoViagem(double distancia) {
        return distancia * 7;
    }

    public String realizarManutencao() {
        return "Onibus realizando manutencao";
    }

}
