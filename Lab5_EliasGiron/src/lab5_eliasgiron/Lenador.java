package lab5_eliasgiron;

public class Lenador extends Legendaria{
    
    public Lenador(String nombre, int dano, int puntos, String objetivo, String velocidad, int costelixir, String tipo) {
        super(nombre, dano, puntos, objetivo, velocidad, costelixir, tipo);
        velocidad = "Alta";
        objetivo = "Terrestre";
        tipo = "Legendaria";
        costelixir =4 ;
    }
    
}
