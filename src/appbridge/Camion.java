import javax.swing.JOptionPane;

class Camion extends Vehiculo {
    public Camion(TipoCombustible tipoCombustible) {
        super(tipoCombustible);
    }

    @Override
    public void conducir() {
        JOptionPane.showMessageDialog(null, "Conduciendo camión.");
        tipoCombustible.suministrarCombustible();
    }
}
