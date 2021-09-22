//########################
//PUNTO 1
//########################
package Punto1;

public abstract class Vehiculo {
    private IMotor motor;

    public Vehiculo(IMotor motor) {
        this.motor = motor;
    }

    public void Acelerar(double cantidad){
        motor.InyectarCombustible(cantidad);
        motor.ConsumirCombustible();
    }

    public void Frenar(){
        System.out.println("\nSe esta frenando.");
    }

    public abstract void MostrarCaracteristicas();
}
//Desarrollado por Pedro Felipe Gómez Bonilla - ID:000396221