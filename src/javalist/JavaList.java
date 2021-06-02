package javalist;

import java.util.ArrayList;
import java.util.List;

public class JavaList {
  
    public static void main(String[] args) {
        
        List<String> nome = new ArrayList();
        
        nome.add("Borge");
        nome.add("Bastos");
        nome.add("Pambo");       
        nome.add(1, "Alexandre");
        nome.remove(0);
        nome.add("Evandro");
        nome.removeIf(x -> x.charAt(0) == 'B');      
        for(String x: nome){
            System.out.println(x);
        }
        
    }
    
}
