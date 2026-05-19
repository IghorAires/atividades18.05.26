public class Triangulo {
    double base;
    double altura;
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea() {
        return (base * altura) / 2;
    }
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(10.0, 5.0);
        System.out.println("Área do triângulo: " + triangulo.calcularArea());
    }
}