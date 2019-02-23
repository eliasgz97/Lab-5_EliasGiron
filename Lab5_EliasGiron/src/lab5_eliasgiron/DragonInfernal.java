package lab5_eliasgiron;

public class DragonInfernal extends Legendaria{

    public DragonInfernal(String nombre, int dano, int puntos, String objetivo, String velocidad, int costelixir, String tipo) {
        super(nombre, dano, puntos, objetivo, velocidad, costelixir, tipo);
        velocidad = "Media";
        objetivo = "Aereos y Terrestres";
        tipo = "Legendaria";
        costelixir =4;
    }
    
}
