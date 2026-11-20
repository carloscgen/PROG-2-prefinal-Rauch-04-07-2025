import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimalismoPatrocinado extends Colecciones {
    private Wallpaper wallpaperPatrocinado;

    public MinimalismoPatrocinado(int descargas, Wallpaper wallpaperPatrocinado) {
        super("Minimalismo Patrocinado", descargas);
        this.wallpaperPatrocinado = wallpaperPatrocinado;
    }

    public List<Wallpaper> listar(Condicion c) {
        List<Wallpaper> res = new ArrayList<>();

        for (Elemento wall : super.getWalls()) {
            res.addAll(wall.listar(c));
        }

        res.add(wallpaperPatrocinado);

        Collections.sort(res);

        return res;
    }

}
