package lab5_eliasgiron;

public class Dragon extends Epica{

    public Dragon(String nombre, int dano, int puntos, String objetivo, String velocidad, int costelixir, String tipo) {
        super(nombre, dano, puntos, objetivo, velocidad, costelixir, tipo);
        velocidad = "Media";
        objetivo = "Aereos y Terrestres";
        tipo = "Epica";
        costelixir = 4;
    }
    
}
