import java.util.List;

public abstract class Elemento {
    private String titulo;
    private int cantDescargas;

    public abstract List<Wallpaper> listar(Condicion c);

    public abstract List<String> listarPals();

    public abstract int cantidadWall();

    public abstract int cantidadDescargasTotales();

    public Elemento(String titulo, int cantDescargas) {
        this.titulo = titulo;
        this.cantDescargas = cantDescargas;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public int getCantDescargas() {
        return this.cantDescargas;
    }

    public void setCantDescargas(int n) {
        this.cantDescargas = n;
    }
}
