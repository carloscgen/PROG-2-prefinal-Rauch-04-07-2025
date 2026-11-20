import java.util.ArrayList;
import java.util.List;

public class Wallpaper extends Elemento implements Comparable<Wallpaper> {
    private int anio;
    private Usuario user;
    private List<String> pals;

    public Wallpaper(String titulo, int cantDescargas, int anio, Usuario user) {
        super(titulo, cantDescargas);
        this.anio = anio;
        this.user = user;
        this.pals = new ArrayList<>();
    }

    public boolean contienePalabra(String pal) {
        return this.pals.contains(pal);
    }

    public Usuario getUser() {
        return this.user;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setPals(String pal) {
        if (!pals.contains(pal)) {
            this.pals.add(pal);
        }
    }

    public List<String> listarPals() {
        return new ArrayList<>(this.pals);
    }

    public List<Wallpaper> listar(Condicion c) {
        List<Wallpaper> res = new ArrayList<>();

        if (c.cumple(this)) {
            res.add(this);
        }

        return res;
    }

    public int compareTo(Wallpaper w) {
        int res = this.user.getNombre().compareTo(w.getUser().getNombre());

        if (res != 0) {
            return res;
        }
        res = this.user.getEmail().compareTo(w.getUser().getEmail());
        return res;
    }

    public int cantidadWall() {
        return 1;
    }

    public int cantidadDescargasTotales() {
        return super.getCantDescargas();
    }

}
