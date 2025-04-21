package zoologico;

public class Leao extends Animal implements Alimentavel{
    private String nome;
    private int idade;

    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Leao emitindo som!");
    }

    public void alimentar() {
        System.out.println("Leao se alimentando!");
    }
}
