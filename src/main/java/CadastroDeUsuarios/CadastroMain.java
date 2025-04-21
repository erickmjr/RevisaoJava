package CadastroDeUsuarios;
import java.util.Scanner;

public class CadastroMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o nome do cadastrado:");
            String nome = sc.nextLine();
            System.out.println("Digite a idade do cadastrado:");
            int idade = sc.nextInt();
            Usuario user1 = new Usuario(nome, idade);

            System.out.println(user1.getNome());
            System.out.println(user1.getIdade());

        } catch(IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finalizando...");
        }

    }
}
