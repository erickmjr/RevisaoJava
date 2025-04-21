package SistemaPagamentos;
import java.util.Scanner;
public class Loja {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da transacao: ");
        double valor = sc.nextDouble();


        System.out.println("Selecione a forma de pagamento.\n1)Boleto\n2)Cartao de credito\nR: ");
        int resp = sc.nextInt();

        switch(resp) {
            case 1:
                PagamentoBoleto pagamentoBoleto = new PagamentoBoleto();
                pagamentoBoleto.realizarPagamento(valor);
                break;
            case 2:
                PagamentoCartaoCredito pagamentoCartaoCredito = new PagamentoCartaoCredito();
                pagamentoCartaoCredito.realizarPagamento(valor);
                break;
        }

    }
}
