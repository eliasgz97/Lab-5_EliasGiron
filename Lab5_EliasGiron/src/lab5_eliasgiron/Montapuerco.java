package lab5_eliasgiron;

public class Montapuerco extends Especial{
    
    public Montapuerco(String nombre, int dano, int puntos, String objetivo, String velocidad, int costelixir, String tipo) {
        super(nombre, dano, puntos, objetivo, velocidad, costelixir, tipo);
        velocidad = "Alta";
        objetivo = "Terrestre";
        costelixir = 4;
        tipo = "Especial";
    }
    
}
