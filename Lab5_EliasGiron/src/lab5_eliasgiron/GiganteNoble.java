package lab5_eliasgiron;

public class GiganteNoble extends Comun{
    
    public GiganteNoble(String nombre, int dano, int puntos, String objetivo, String velocidad, int costelixir, String tipo) {
        super(nombre, dano, puntos, objetivo, velocidad, costelixir, tipo);
        velocidad = "Media";
        objetivo = "Terrestre";
        tipo = "Comun";
        costelixir = 6;
    }
    
}
