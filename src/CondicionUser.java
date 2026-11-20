public class CondicionUser extends Condicion {
    private Usuario user;

    public CondicionUser(Usuario user) {
        this.user = user;
    }

    public boolean cumple(Wallpaper w) {
        return w.getUser().getNombre().equals(user.getNombre());
    }

}
