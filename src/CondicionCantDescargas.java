public class CondicionCantDescargas extends Condicion {
    private int cant;

    public CondicionCantDescargas(int cant) {
        this.cant = cant;
    }

    public boolean cumple(Wallpaper w) {
        return w.getCantDescargas() > this.cant;
    }
}
