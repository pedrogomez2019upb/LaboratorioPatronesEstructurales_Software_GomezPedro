//########################
//PUNTO 1
//########################
package Punto1;

public class Gasolina implements IMotor{
    @Override
    public void InyectarCombustible(double galones) {
        System.out.println("\nSe esta poniendo "+galones+" gal de Gasolina.");
    }

    @Override
    public void ConsumirCombustible() {
        RealizarCombustion();
    }

    private void RealizarCombustion(){
        System.out.println("\nCombustión Realizada.");
    }
}
//Desarrollado por Pedro Felipe Gómez Bonilla - ID:000396221