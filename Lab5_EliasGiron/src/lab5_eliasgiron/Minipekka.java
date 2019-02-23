package lab5_eliasgiron;

public class Minipekka extends Especial{
    
    public Minipekka(String nombre, int dano, int puntos, String objetivo, String velocidad, int costelixir, String tipo) {
        super(nombre, dano, puntos, objetivo, velocidad, costelixir, tipo);
        velocidad = "Alta";
        objetivo = "Terrestre";
        tipo = "Especial";
        costelixir = 4; 
        
    }
    
}
