public class punto8 {
    public static void main(String[] args) {
        //8. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
        // que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje
        // "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

            try {
                dividePorCero(5);
            } catch (ArithmeticException e) {
                System.out.println("Esto no puede hacerse");
            } finally {
                System.out.println("Demo de código");
            }


    }
    public static int dividePorCero(int a)throws ArithmeticException{
        int resultado = 0;
        try{
            resultado=a/0;
        } catch (ArithmeticException e) {

            throw new ArithmeticException();
        }
        return resultado;
    }
}
