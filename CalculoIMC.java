public class CalculoIMC {
    public static void main(String[] args) {
        double peso, altura, imc;
        peso = 115.0;      // peso em quilogramas
        altura = 1.83;    // altura em metros
        imc = peso / (altura * altura);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("IMC: " + imc);
    }
}