package AbstraccionConcreta;

import Abstraccion.Vehiculo;
import Implementacion.TipoCombustible;
import javax.swing.JOptionPane;

// Abstracción refinada: Extiende la abstracción y proporciona implementaciones específicas de los vehículos.
public class Camion extends Vehiculo {
    public Camion(TipoCombustible tipoCombustible) {
        super(tipoCombustible);
    }

    @Override
    public void conducir() {
        JOptionPane.showMessageDialog(null, "Conduciendo camión.");
        tipoCombustible.suministrarCombustible();
    }
}
