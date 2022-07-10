package practicextraordinaria;

import java.util.HashSet;

/**
 *
 * @author emmar
 */
public class Humano implements java.io.Serializable {
    lealtad loyalty;

    enum lealtad{
        alta,normal,baja;
    }
    
    public Humano(String l) {
        if ("alta".equals(l)){
            loyalty = lealtad.alta;
        }
        if ("normal".equals(l)){
            loyalty = lealtad.normal;
        }
        if ("baja".equals(l)){
            loyalty = lealtad.baja;
        }
        
    }

    public lealtad getLoyalty() {
        return loyalty;
    }

    
}

