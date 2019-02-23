package lab5_eliasgiron;

public class PandillaDuendes extends Comun{

    public PandillaDuendes(String nombre, int dano, int puntos, String objetivo, String velocidad, int costelixir, String tipo) {
        super(nombre, dano, puntos, objetivo, velocidad, costelixir, tipo);
        velocidad = "Alta";
        objetivo = "Aereos y Terrestres";
        tipo = "Comun";
        costelixir = 3;
    }
    
}
