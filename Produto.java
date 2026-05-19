public class Produto {
    String nome;
    double preco;
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void aplicarDesconto(double percentual) {
        preco = preco - (preco * percentual / 100);
    }
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3500.00);
        System.out.println("Produto: " + produto.nome);
        System.out.println("Preço original: R$ " + produto.preco);
        produto.aplicarDesconto(10);
        System.out.println("Preço com desconto: R$ " + produto.preco);
    }
}