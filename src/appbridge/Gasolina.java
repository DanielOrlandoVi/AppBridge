import javax.swing.JOptionPane;

// Implementadores concretos: Proporcionan implementaciones específicas del tipo de combustible.
class Gasolina implements TipoCombustible {
    @Override
    public void suministrarCombustible() {
        JOptionPane.showMessageDialog(null, "Suministrando gasolina al vehículo.");
    }
}