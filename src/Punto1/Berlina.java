//########################
//PUNTO 1
//########################
package Punto1;

public class Berlina extends Vehiculo{

    private int CapacidadMaletero;

    public Berlina(IMotor motor , int capacidadMaletero) {
        super(motor);
        this.CapacidadMaletero=capacidadMaletero;
    }

    @Override
    public void MostrarCaracteristicas() {
        System.out.println("\nEs una berlina con "+CapacidadMaletero+" de capacidad en su maletero.");
    }

}
//Desarrollado por Pedro Felipe Gómez Bonilla - ID:000396221