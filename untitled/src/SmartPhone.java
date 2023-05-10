public class SmartPhone extends SmartDevice{
   String[] apps= {};
    double credito;
    double senial;

    public void cargarCredito(int carga){

        credito+=carga;
    }
    public void hacerLlamada(double horas){
       if(senial>50){
           int cont=0;
           while(credito>0&&cont<=horas*60){
               credito-=1.5;
               cont++;
               if(credito==0){
                   System.out.println("Su credito es insuficiente para realizar esta llamada");
               }
           }
       }else{
           System.out.println("Sin señal");
       }
    }
    public SmartPhone(int bateria, boolean encendido, boolean reloj, boolean calculadora, boolean bluetooth, boolean wifi, boolean ubicacion, String apss,int credito,double senial) {
        super(bateria, encendido, reloj, calculadora, bluetooth, wifi, ubicacion);
        this.apps=apps;
        this.credito=credito;
        this.senial=senial;
    }
    public SmartPhone(){}
}
