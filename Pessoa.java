public class Pessoa {
    String nome;
    int idade;
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void fazerAniversario() {
        idade++;
    }
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ighor", 24);
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade inicial: " + pessoa.idade);
        pessoa.fazerAniversario();
        System.out.println("Nova idade: " + pessoa.idade);
    }
}