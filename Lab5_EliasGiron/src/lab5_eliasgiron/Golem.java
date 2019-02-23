package lab5_eliasgiron;

public class Golem extends Epica{

    public Golem(String nombre, int dano, int puntos, String objetivo, String velocidad, int costelixir, String tipo) {
        super(nombre, dano, puntos, objetivo, velocidad, costelixir, tipo);
        velocidad = "Baja";
        objetivo = "Terrestre";
        tipo = "Epica";
        costelixir = 8;
    }
    
}
