public class Retangulo {
    double largura;
    double altura;
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    public double calcularArea() {
        return largura * altura;
    }
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
    public static void main(String[] args) {
        Retangulo ret = new Retangulo(5.0, 3.0);
        System.out.println("Área: " + ret.calcularArea());
        System.out.println("Perímetro: " + ret.calcularPerimetro());
    }
}