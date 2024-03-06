import javax.swing.JOptionPane;


// Cliente: Utiliza la abstracción para interactuar con las implementaciones concretas.
public class Main {
    public static void main(String[] args) {
        while (true) {
            String[] vehiculos = {"Automóvil", "Camión", "Salir"};
            String opcionVehiculo = (String) JOptionPane.showInputDialog(null, "Seleccione un vehículo:", "Selección de Vehículo",
                    JOptionPane.QUESTION_MESSAGE, null, vehiculos, vehiculos[0]);

            if (opcionVehiculo == null || opcionVehiculo.equals("Salir")) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break;
            }

            String[] combustibles = {"Gasolina", "Diesel"};
            String opcionCombustible = (String) JOptionPane.showInputDialog(null, "Seleccione un tipo de combustible:", "Selección de Combustible",
                    JOptionPane.QUESTION_MESSAGE, null, combustibles, combustibles[0]);

            TipoCombustible tipoCombustible;
            switch (opcionCombustible) {
                case "Gasolina":
                    tipoCombustible = new Gasolina();
                    break;
                case "Diesel":
                    tipoCombustible = new Diesel();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tipo de combustible no válido.");
                    return;
            }

            switch (opcionVehiculo) {
                case "Automóvil":
                    Vehiculo automovil = new Automovil(tipoCombustible);
                    automovil.conducir();
                    break;
                case "Camión":
                    Vehiculo camion = new Camion(tipoCombustible);
                    camion.conducir();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Vehículo no válido.");
                    return;
            }
        }
    }
}