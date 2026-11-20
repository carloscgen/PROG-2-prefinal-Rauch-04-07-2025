import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colecciones extends Elemento {
    private List<Elemento> walls;

    public Colecciones(String titulo, int cantDescargas) {
        super(titulo, cantDescargas);
        this.walls = new ArrayList<>();
    }

    public void agregarWalls(Elemento e) {
        this.walls.add(e);
    }

    public List<Elemento> getWalls() {
        return new ArrayList<>(this.walls);
    }

    public List<Wallpaper> listar(Condicion c) {
        List<Wallpaper> res = new ArrayList<>();

        for (Elemento wall : walls) {
            res.addAll(wall.listar(c));
        }

        Collections.sort(res);

        return res;
    }

    public List<String> listarPals() {
        List<String> res = new ArrayList<>();

        for (Elemento wall : walls) {
            List<String> palabrasWall = wall.listarPals();

            for (String palabra : palabrasWall) {
                if (!res.contains(palabra)) {
                    res.add(palabra);
                }
            }
        }

        return res;
    }

    public int cantidadWall() {
        int total = 0;

        for (Elemento wall : walls) {
            total += wall.cantidadWall();
        }
        return total;
    }

    public int cantidadDescargasTotales() {
        int total = super.getCantDescargas();

        for (Elemento wall : walls) {
            total += wall.cantidadDescargasTotales();
        }
        return total;
    }

}
