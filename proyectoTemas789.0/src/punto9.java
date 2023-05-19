import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class punto9 {
    public static void main(String[] args) {
        cambio((byte) 2, (byte) 3);
    }
    //9. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
    // La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

    public static void cambio(byte fileIn, byte fileOut){
        try{
            InputStream fichero= new FileInputStream(String.valueOf(fileIn));
            byte [] datos= fichero.readAllBytes();
            PrintStream destiny= new PrintStream(String.valueOf(fileOut));
            destiny.write(datos);
        }catch(Exception e){

        }
    }
}
