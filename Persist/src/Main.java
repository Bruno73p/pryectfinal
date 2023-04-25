public class Main {
    public static void main(String[] args) {
        long numero = 25;

        int resultado = Persistence(numero);
        System.out.println(resultado);
    }

    public static int Persistence(long number) {
        int retu = (int) number;
        int contador= 0;
        while (retu >= 10) {
            contador++;
            if (number >= 10 && number < 100) {
                int multi1 = Math.round(number / 10);
                int multi2 = (int) (number % 10);
                retu = multi1 * multi2;
                number = retu;
            } else if(number >= 100 && number <1000){
               int mult= Math.round(number /100);
               int mult2= (int) Math.round((number % 100)/10);
                int mult3 = (int) Math.round(number%10);
                retu=mult*mult2*mult3;
                number=retu;
            }
        }
        return contador;
    }
}