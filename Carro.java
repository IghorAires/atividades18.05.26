public class Carro {
    String marca;
    String modelo;
    int ano;
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2024);
        carro.exibirDetalhes();
    }
}