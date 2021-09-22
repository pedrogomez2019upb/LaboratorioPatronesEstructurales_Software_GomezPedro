//########################
//PUNTO 2
//########################
package Punto2;

public class PianoAcusticAdapter extends Guitar {

    private PianoAcustic pa;

    public PianoAcusticAdapter(){
        pa= new PianoAcustic();
    }

    @Override
    public String encender() {
        return pa.tocar();
    }

    @Override
    public String apagar() {
        return pa.parar();
    }

}
//Desarrollado por Pedro Felipe Gómez Bonilla - ID:000396221