import java.util.ArrayList;
import java.util.LinkedList;

public class punto6 {
    public static void main(String[] args) {
        //6. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando
        // únicamente el valor de cada elemento.

        ArrayList<String> list= new ArrayList<>();
        list.add("Hola");
        list.add("Mundo");
        list.add("Hello");
        list.add("World");
        System.out.println("Esta es la ArrayList: "+ list);
        LinkedList<String> lista = new LinkedList<>();
        for (int i=0; i<list.size(); i++){
            lista.add(list.get(i));
        }
        System.out.println("Esta es la LinkedList: "+lista);
    }
}
