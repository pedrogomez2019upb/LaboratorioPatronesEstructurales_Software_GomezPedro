//########################
//PUNTO 1
//########################
package Punto1;

public class Main {

    public static void main(String[] args) {
        IMotor diesel = new Diesel();
        IMotor gasolina = new Gasolina();
        Vehiculo berlina = new Berlina(diesel, 54);
        berlina.MostrarCaracteristicas();
        berlina.Acelerar(2.7);
        berlina.Frenar();
        Vehiculo monovolumen = new Monovolumen(gasolina, true);
        monovolumen.MostrarCaracteristicas();
        monovolumen.Acelerar(4.8);
        monovolumen.Frenar();
    }
}
//Desarrollado por Pedro Felipe Gómez Bonilla - ID:000396221