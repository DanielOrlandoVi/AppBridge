import javax.swing.JOptionPane;


// Cliente: Utiliza la abstracción para interactuar con las implementaciones concretas.
public class Main {
    public static void main(String[] args) {
        TipoCombustible gasolina = new Gasolina();
        TipoCombustible diesel = new Diesel();

        Vehiculo automovilGasolina = new Automovil(gasolina);
        Vehiculo camionDiesel = new Camion(diesel);

        automovilGasolina.conducir();
        camionDiesel.conducir();
    }
}
