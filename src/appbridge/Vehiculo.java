// Abstracción: Define la interfaz de alto nivel que el cliente utiliza.
abstract class Vehiculo {
    protected TipoCombustible tipoCombustible;

    public Vehiculo(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public abstract void conducir();
}
