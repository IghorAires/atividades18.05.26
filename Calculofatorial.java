public class Calculofatorial {
  public static void main(String[] args) {
    int numero = 5;
    int fatorial = 1;
    for (int i = 1; i <= numero; i++) {
      fatorial = fatorial * i;
    }
    System.out.println("Número: " + numero);
    System.out.println("Fatorial: " + fatorial);
  }
}