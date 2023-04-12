import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import javax.security.auth.kerberos.EncryptionKey;
//import com.dio.list.Temperatura;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        final List<Temperatura> temperaturas = new ArrayList<>();

        temperaturas.add(new Temperatura(1,25.5));
        temperaturas.add(new Temperatura(2,28.5));
        temperaturas.add(new Temperatura(3,31));
        temperaturas.add(new Temperatura(4,30));
        temperaturas.add(new Temperatura(5,27.5));
        temperaturas.add(new Temperatura(6,28.5));
        
        System.out.println(temperaturas.toString());
        
        double media = 0;
        
        for(Temperatura t: temperaturas){
            
            media = media + t.getTemperaturaMedia();
        }
        
        media = media/6; //calculando a média dos meses
        System.out.println("Temperatura média mensal: " + media );
        for(Temperatura t: temperaturas){
            if(t.getTemperaturaMedia() > media){
                System.out.println(t.toString());
            }
        }
        



    }
}
