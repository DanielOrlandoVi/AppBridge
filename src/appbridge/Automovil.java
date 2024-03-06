import javax.swing.JOptionPane;

// Abstracción refinada: Extiende la abstracción y proporciona implementaciones específicas de los vehículos.
class Automovil extends Vehiculo {
    public Automovil(TipoCombustible tipoCombustible) {
        super(tipoCombustible);
    }

    @Override
    public void conducir() {
        JOptionPane.showMessageDialog(null, "Conduciendo automóvil.");
        tipoCombustible.suministrarCombustible();
    }
}
