import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = menu(scanner);
        if(opcion!=0) {
            operando(opcion, scanner);
        }



    }
    public static int menu(Scanner scanner) {
        int a = 0;

        do {
            System.out.println("Ingrese la opcion deseada");
            System.out.println("1.kilos a gramos. ");
            System.out.println( "2.kilos a miligramos.");
            System.out.println("3.gramos a miligramos.");
            System.out.println("4.kilometros a metros.");
            System.out.println("5.kilometros a milimetros.");
            System.out.println("6.metros a milimetros.");
            System.out.println("0.salir");
            a = scanner.nextInt();
        }while (a>6||a<0);
        return a;

    }
    public static void operando(int a, Scanner scanner){

        switch (a) {
            case 1:
                System.out.println(tot(scanner)*1000);
                break;
            case 2:
                System.out.println(tot(scanner)*1000000);
                break;
            case 3:
                System.out.println(tot(scanner)*1000);
                break;
            case 4:
                System.out.println(tot(scanner)*1000);
                break;
            case 5:
                System.out.println(tot(scanner)*1000000);
                break;
            case 6:
                System.out.println(tot(scanner)*1000);
                break;
            default:
                System.out.println();
        }
   }
   public static double tot(Scanner scanner){
       System.out.println("ingrese la cantidad a convertir");
       return scanner.nextDouble();
   }

}