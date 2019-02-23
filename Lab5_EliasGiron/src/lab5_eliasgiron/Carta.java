package lab5_eliasgiron;

public class Carta {
    //contendran Nombre, Daño, Puntos de Vida, Objetivo (Aereos, Terrestres o Aereos y Terrestres), Velocidad (Alta, Media y Baja)
    //y Coste de Elixir. Pueden Comun, Especial, Epica y Legendaria.
    private String nombre;
    private int dano;
    private int puntos;
    private String objetivo;
    private String velocidad;
    private int costelixir;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Carta(String nombre, int dano, int puntos, String objetivo, String velocidad, int costelixir, String tipo) {
        this.nombre = nombre;
        this.dano = dano;
        this.puntos = puntos;
        this.objetivo = objetivo;
        this.velocidad = velocidad;
        this.costelixir = costelixir;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public int getCostelixir() {
        return costelixir;
    }

    public void setCostelixir(int costelixir) {
        this.costelixir = costelixir;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
