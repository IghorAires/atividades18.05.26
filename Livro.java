public class Livro {
    String titulo;
    String autor;
    int numPaginas;
    public Livro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
    }
}
class MainLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("Sport, uma razão para viver!", "Beto Lago", 256);
        livro.exibirInformacoes();
    }
}