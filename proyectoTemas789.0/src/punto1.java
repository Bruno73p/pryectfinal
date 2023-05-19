public class punto1 {
    /*
1.Dada la función: public static String reverse(String texto) { }
Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
 */
    public static void main(String[] args) {
        String text =reverse("hola mundo");
        System.out.println(text);
    }
    public static String reverse(String texto) {
        StringBuilder reserva= new StringBuilder();
        int i=texto.length()-1;
        do {
            reserva.append(texto.charAt(i));
            i--;

        }while (i>=0);
        return reserva.toString();
    }
}
