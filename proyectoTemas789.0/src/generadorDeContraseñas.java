import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class generadorDeContraseñas {
    //Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y
    // un ArrayList, LinkedList o array.
    public static void main(String[] args) {


        try {
            InputStream hola = new FileInputStream("C:\\Users\\Bruno\\Documents\\PROGRAMACION\\texto.txt");
            HashMap<String, Integer> mapa= new HashMap();
            try {
                byte[] arrayDeBytes = hola.readAllBytes();
                transformador(arrayDeBytes);
                incluirenHP(transformador(arrayDeBytes),mapa);
                PrintStream cantidadDePalabras= new PrintStream("C:\\Users\\Bruno\\Documents\\PROGRAMACION\\destino.txt");
                cantidadDePalabras.write(String.valueOf(mapa).getBytes());
            } catch (Exception e) {
                System.out.println("Fichero inexistente");
            }
        } catch (Exception e) {
            System.out.println("El fichero no se encuentra");
        }

    }


public static void incluirenHP(ArrayList arrayList,HashMap map){


    for (int i=0;i<arrayList.size();i++){
        map.put((String) arrayList.get(i),(Math.random()*16100));
    }


}



    public static ArrayList<String> transformador(byte[] arrayGenerico){
        ArrayList<String> palabras= new ArrayList<String>();
        String palabra = "";
        for (byte chars : arrayGenerico) {
            palabra+=(String.valueOf((char) chars));
            if(palabra.endsWith(" ")||palabra.endsWith(",")){
                if(palabra.equals(" ")){
                    continue;
                }else{
                    palabra=palabra.substring(0,palabra.length()-1);
                    palabras.add(palabra);
                    palabra="";
                }

            }
        }


        return palabras;
    }
}
