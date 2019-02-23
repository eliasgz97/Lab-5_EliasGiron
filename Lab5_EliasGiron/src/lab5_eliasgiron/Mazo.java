package lab5_eliasgiron;
import java.util.ArrayList;
public class Mazo {
    //tendran Coste que sera el promedio del coste de las cartas y contendran 3 cartas.
    private int coste;
    private Carta carta1;
    private Carta carta2;
    private Carta carta3;;
    public Mazo() {
    }

    public Mazo(int coste, Carta carta1, Carta carta2, Carta carta3) {
        this.coste = coste;
        this.carta1 = carta1;
        this.carta2 = carta2;
        this.carta3 = carta3;
    }

    public Carta getCarta1() {
        return carta1;
    }

    public void setCarta1(Carta carta1) {
        this.carta1 = carta1;
    }

    public Carta getCarta2() {
        return carta2;
    }

    public void setCarta2(Carta carta2) {
        this.carta2 = carta2;
    }

    public Carta getCarta3() {
        return carta3;
    }

    public void setCarta3(Carta carta3) {
        this.carta3 = carta3;
    }
    

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
    
    @Override
    public String toString() {
        return "mazo ";
        
    }
    
    
    
}
