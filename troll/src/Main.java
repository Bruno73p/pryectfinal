//ESTE PROGRAMA RETORNA UN STRING QUE INGRESES PERO SIN LAS VOCALES.
public class Main {
    public static void main(String[] args) {
        String solucion = sinVocales("Hola mi vida te amo");
        System.out.println(solucion);

    }

    public static String sinVocales(String str) {
        String aa = "";
        for (int i = 0; i < str.length(); i++) {
            char titi=str.charAt(i);

            if (bol(titi)) {
                aa = aa;
            } else {
                aa = aa + titi;
            }
        }
        return aa;
    }

    public static boolean bol(char hola) {

        boolean bola = hola == 'a'||hola == 'A';
        boolean bola1 = hola == 'e'||hola == 'E';
        boolean bola2 = hola == 'i'||hola == 'I';
        boolean bola3 = hola == 'o'||hola == 'O';
        boolean bola4 = hola == 'u'||hola == 'U';
        boolean bolas = bola || bola1 || bola2 || bola3 || bola4;
        return bolas;
    }
}
