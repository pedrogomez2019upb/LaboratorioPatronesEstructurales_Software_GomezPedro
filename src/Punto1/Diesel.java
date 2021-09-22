//########################
//PUNTO 1
//########################
package Punto1;

public class Diesel implements IMotor {

    @Override
    public void InyectarCombustible(double galones) {
        System.out.println("\nSe esta poniendo "+galones+" gal de Diesel.");
    }

    @Override
    public void ConsumirCombustible() {
        RealizarExplosion();
    }

    private void RealizarExplosion(){
        System.out.println("\nExplosión Realizada.");
    }
}
//Desarrollado por Pedro Felipe Gómez Bonilla - ID:000396221