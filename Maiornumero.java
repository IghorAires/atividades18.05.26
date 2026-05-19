public class Maiornumero {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = 5;
        num2 = 6;
        num3 = 27;
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("O maior número é: " + num3);
        }
    }
}