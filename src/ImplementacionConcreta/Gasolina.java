package ImplementacionConcreta;

import Implementacion.TipoCombustible;
import javax.swing.JOptionPane;

// Implementadores concretos: Proporcionan implementaciones específicas del tipo de combustible.
public class Gasolina implements TipoCombustible {
    @Override
    public void suministrarCombustible() {
        JOptionPane.showMessageDialog(null, "Suministrando gasolina al vehículo.");
    }
}