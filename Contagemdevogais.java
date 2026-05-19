public class Contagemdevogais {
    public static void main(String[] args) {
        String texto = "Boa noite, eu me chamo Ighor Aires e tenho 24 anos";
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char letra = Character.toLowerCase(texto.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                    letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        System.out.println("Texto: " + texto);
        System.out.println("Número de vogais: " + contador);
    }
}