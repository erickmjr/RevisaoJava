package zoologico;

public class Gato extends Animal implements Alimentavel{
    private String nome;
    private int idade;

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Gato emitindo som!");
    }

    public void alimentar() {
        System.out.println("Gato se alimentando!");
    }
}
