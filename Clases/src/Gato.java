public class Gato extends Animal{
    double peso;
    boolean ganasDeJugar;
    int nivelDeSuenio;
    boolean hambre;
    public Gato(int patas, String raza, String tipoDePelo, String colorDePelo, boolean cola,int nivelDeSuenio, boolean ganasDeJugar, boolean hambre, double peso ) {
        super(patas, raza, tipoDePelo, colorDePelo, cola);
        this.nivelDeSuenio =nivelDeSuenio;
        this.ganasDeJugar =ganasDeJugar;
        this.peso=peso;
        this.hambre=hambre;

    }
    public void jugar(boolean ganasDeJugar,boolean hambre, int nivelDeSuenio){
        if(ganasDeJugar){
            hambre=true;
            nivelDeSuenio+=1;
            ganasDeJugar=!ganasDeJugar;
        }
    }
    public void comer(boolean hambre){
        hambre=false;
    }
    public void dormir(int nivelDeSuenio, int horasDeSuenio){
        nivelDeSuenio-=horasDeSuenio/2;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "peso=" + peso +
                ", ganasDeJugar=" + ganasDeJugar +
                ", nivelDeSuenio=" + nivelDeSuenio +
                ", hambre=" + hambre +
                ", patas=" + patas +
                ", raza='" + raza + '\'' +
                ", tipoDePelo='" + tipoDePelo + '\'' +
                ", colorDePelo='" + colorDePelo + '\'' +
                ", cola=" + cola +
                '}';
    }
}
