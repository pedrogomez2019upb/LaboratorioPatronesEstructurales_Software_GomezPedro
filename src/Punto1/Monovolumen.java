//########################
//PUNTO 1
//########################
package Punto1;

public class Monovolumen extends Vehiculo{
    private boolean PuertaCorrediza;

    public Monovolumen(IMotor motor , boolean puertaCorrediza) {
        super(motor);
        this.PuertaCorrediza=puertaCorrediza;
    }

    @Override
    public void MostrarCaracteristicas() {
        System.out.println("\nEs una monovolumen y "+PuertaCorrediza+" (true=si , false=no) contiene puerta corrediza.");
    }
}
//Desarrollado por Pedro Felipe Gómez Bonilla - ID:000396221