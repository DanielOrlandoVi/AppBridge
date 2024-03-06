import javax.swing.JOptionPane;

class Diesel implements TipoCombustible {
    @Override
    public void suministrarCombustible() {
        JOptionPane.showMessageDialog(null, "Suministrando diesel al vehículo.");
    }
}
