//########################
//PUNTO 2
//########################
package Punto2;

public class Main {
    public static void main(String[] args) {
        PianoElectric pe =new PianoElectric();
        PianoAcusticAdapter pa = new PianoAcusticAdapter();
        System.out.println(pe.encender());
        System.out.println(pe.apagar());
        System.out.println(pa.encender());
        System.out.println(pa.apagar());

    }
}
//Desarrollado por Pedro Felipe Gómez Bonilla - ID:000396221