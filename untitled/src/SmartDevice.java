public class SmartDevice {
    protected static Object usar;
    int bateria=100;
    boolean encendido;
    boolean reloj;
    boolean calculadora;
    boolean bluetooth;
    boolean wifi;
    boolean ubicacion;

    public SmartDevice(){

    }
    public SmartDevice(int bateria, boolean encendido, boolean reloj, boolean calculadora, boolean bluetooth, boolean wifi, boolean ubicacion){
        this.bateria=bateria;
        this.encendido=encendido;
        this.reloj=reloj;
        this. calculadora= calculadora;
        this. bluetooth= bluetooth;
        this.wifi=wifi;
        this.ubicacion=ubicacion;
    }
    public void prendeYApaga(){
        encendido=!encendido;
    }
    public void usar(int horas){
        if(encendido){
            bateria-=horas/3;
        } else{
            System.out.println("Debe encender el dispositivo");
        }
    }
    public void cargar(int horas){
        bateria+=horas/2;
    }
}


    /*En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

        Agregaréis atributos tal cual tendrían esos objetos en la realidad.

        Crear constructor vacío y con todos los parámetros para cada clase.

        Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
*/