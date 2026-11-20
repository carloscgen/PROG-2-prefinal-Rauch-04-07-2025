public class CondicionAnio extends Condicion {
    private int anio;

    public CondicionAnio(int anio) {
        this.anio = anio;
    }

    public boolean cumple(Wallpaper w) {
        return w.getAnio() == this.anio;
    }
}
