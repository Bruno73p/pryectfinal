public class punto3 {
    public static void main(String[] args) {
        //3. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en
        // ambas dimensiones.
        int[][]ArrayBI=new int[2][4];
        //bucles for de relleno
        for (int i=0;i<ArrayBI.length;i++){
            for(int j=0;j<ArrayBI[i].length;j++){
                ArrayBI[i][j]= (i+1)*j;
            }
        }
        //bucles para imprimir
        for (int i=0;i<ArrayBI.length;i++){
            for(int j=0;j<ArrayBI[i].length;j++){
                System.out.println("este es el valor del array: "+ArrayBI[i][j]+" en la posicion i: "+(i+1)+
                        ", posicion j: "+ (j+1));
            }
        }
    }
}
