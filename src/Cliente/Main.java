package Cliente;

import ImplementacionConcreta.*;
import AbstraccionConcreta.*;
import Abstraccion.Vehiculo;
import Implementacion.TipoCombustible;


import javax.swing.JOptionPane;


// Cliente: Utiliza la abstracción para interactuar con las implementaciones concretas.
public class Main {
    public static void main(String[] args) {
        while (true) {
            
            //Brinda las opciones de menu
            String[] vehiculos = {"Automóvil", "Camión", "Salir"};
            String opcionVehiculo = (String) JOptionPane.showInputDialog(null, "Seleccione un vehículo:", "Selección de Vehículo",
                    JOptionPane.QUESTION_MESSAGE, null, vehiculos, vehiculos[0]);

            if (opcionVehiculo == null || opcionVehiculo.equals("Salir")) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break;
            }
            
            //Brinda las opciones de combustible
            String[] combustibles = {"Gasolina", "Diesel"};
            String opcionCombustible = (String) JOptionPane.showInputDialog(null, "Seleccione un tipo de combustible:", "Selección de Combustible",
                    JOptionPane.QUESTION_MESSAGE, null, combustibles, combustibles[0]);

            TipoCombustible tipoCombustible;
            
            //Captura la opcion de combustible y crea un objeto tipoCombustible de una clase Gasolina o Diesel
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
            
            //Captura la opcion de vehiculo, dependiendo de cual sea crea el objeto Automovil o camion con atributo tipo de combustible
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