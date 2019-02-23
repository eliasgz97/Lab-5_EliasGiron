package lab5_eliasgiron;
import java.util.ArrayList;
public class Clan {
    private String nombreclan;
    private ArrayList <Usuario> usuarios = new ArrayList();
    private Usuario lider;

    public Usuario getLider() {
        return lider;
    }

    public void setLider(Usuario lider) {
        this.lider = lider;
    }

    public Clan(String nombreclan, Usuario lider) {
        this.nombreclan = nombreclan;
        this.lider = lider;
    }
    

    public String getNombreclan() {
        return nombreclan;
    }

    public void setNombreclan(String nombreclan) {
        this.nombreclan = nombreclan;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
