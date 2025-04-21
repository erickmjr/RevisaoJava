package SistemaPagamentos;

public class PagamentoCartaoCredito implements Pagamento{
    private double valor;
    private int numeroCartaoCredito = 0;

    public PagamentoCartaoCredito(){
        this.numeroCartaoCredito++;
    }
    public void realizarPagamento(double valor) {
        if(valor <= 0) {
            System.out.println("O valor do pagamento nao pode ser menor ou igual a 0.");
        } else {
            System.out.println("Pagamento no valor de " + valor + " efetuado com cartao de credito.");
        }
    }

    public int getNumeroCartaoCredito() {
        return numeroCartaoCredito;
    }

    public void setNumeroCartaoCredito(int numeroCartaoCredito) {
        this.numeroCartaoCredito = numeroCartaoCredito;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
