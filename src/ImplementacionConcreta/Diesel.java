package ImplementacionConcreta;

import Implementacion.TipoCombustible;
import javax.swing.JOptionPane;

public class Diesel implements TipoCombustible {
    @Override
    public void suministrarCombustible() {
        JOptionPane.showMessageDialog(null, "Suministrando diesel al vehículo.");
    }
}
