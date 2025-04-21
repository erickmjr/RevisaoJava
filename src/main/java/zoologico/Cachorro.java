package zoologico;

public class Cachorro extends Animal implements Alimentavel{
    private String nome;
    private int idade;

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Cachorro emitindo som!");
    }

    public void alimentar() {
        System.out.println("Cachorro se alimentando!");
    }
}
