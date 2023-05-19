import java.util.Vector;

public class punto4 {
    public static void main(String[] args) {
        //4. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3.er elemento y
        // muestra el resultado final.

        Vector<Integer> vector = new Vector<>();
        vector.add(30);
        vector.add(50);
        vector.add(12);
        vector.add(73);
        vector.add(14);
        System.out.println("datos del vector: "+vector);
        vector.remove(2);
        vector.remove(1);
        System.out.println("datos del vector: "+vector);

    }
}
