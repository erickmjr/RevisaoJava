package EmpresaDeTransporte;

public abstract class Veiculo {
    private String placa, modelo;

    public Veiculo(String placa, String modelo) throws PlacaInvalidaException{
        if(placa.trim().isEmpty()) {
            throw new PlacaInvalidaException("A placa do veiculo nao pode ser nula ou vazia.");
        } else {
            this.placa = placa;
            this.modelo = modelo;
        }
    }

    public abstract double calcularCustoViagem(double distancia);

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
