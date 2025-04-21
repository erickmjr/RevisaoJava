package CadastroDeUsuarios;

public class Usuario{
    private String nome;
    private int idade;

    public Usuario(String nome, int idade) throws IdadeInvalidaException{

        if (idade <= 0) {
            throw new IdadeInvalidaException("A idade nao pode ser menor ou igual a 0");
        } else {
            this.nome = nome;
            this.idade = idade;
        }
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
