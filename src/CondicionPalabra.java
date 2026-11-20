public class CondicionPalabra extends Condicion {
    private String palabra;

    public CondicionPalabra(String palabra) {
        this.palabra = palabra;
    }

    public boolean cumple(Wallpaper w) {
        return w.listarPals().contains(this.palabra);
    }

}
