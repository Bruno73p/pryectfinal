public class SmartWatch  extends SmartDevice {
    int presionArterial;
    int contadorPasos;
    boolean caminando=false;
    public void caminar(int contadorPasos){
        if(caminando){
            contadorPasos++;
        }
    }
    public void medirPresion(){
        System.out.println((Math.random()*100));
    }

    public SmartWatch(int presionArterial,int contadorPasos, int bateria, boolean encendido, boolean reloj, boolean calculadora, boolean bluetooth, boolean wifi, boolean ubicacion ){
        super(bateria, encendido, reloj, calculadora, bluetooth, wifi, ubicacion);
        this.presionArterial=presionArterial;
        this.contadorPasos=contadorPasos;

    }
    public SmartWatch(){}

}