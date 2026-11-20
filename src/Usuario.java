public class Usuario {
    private String nombre;
    private int anio;
    private String email;

    public Usuario(String nombre, int anio, String email) {
        this.nombre = nombre;
        this.anio = anio;
        this.email = email;
    }

    public int getAnio() {
        return this.anio;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNombre() {
        return this.nombre;
    }
}
