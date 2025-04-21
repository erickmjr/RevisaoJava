package SistemaPagamentos;

public class PagamentoBoleto implements Pagamento{
    private double valor;
    private int numeroBoleto = 0;

    public PagamentoBoleto(){
        this.numeroBoleto++;
    }
    public void realizarPagamento(double valor) {
        if(valor <= 0) {
            System.out.println("O valor do pagamento nao pode ser menor ou igual a 0.");
        } else {
            System.out.println("Pagamento no valor de " + valor + " efetuado por boleto.");
        }
    }

    public int getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto(int numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
