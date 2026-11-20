public class WallpaperUniversal extends Wallpaper {

    public WallpaperUniversal(String titulo, int cantDescargas, int anio, Usuario user) {
        super(titulo, cantDescargas, anio, user);
    }

    public boolean contienePalabra(String pal) {
        return true;
    }

}
