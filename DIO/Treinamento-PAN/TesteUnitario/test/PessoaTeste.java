
import com.dio.testeJUnit.Pessoa;
import java.time.LocalDate;
import org.junit.Test;
import org.junit.Assert;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alifi
 */
public class PessoaTeste {
    
    @Test
    void verificarIdade(){
        
        Pessoa p = new Pessoa(
                "Alifi Santos", 
                LocalDate.of(2000, 1, 18), 
                1.72, 
                74.0,
                "preta", 
                "47013722855"
        );
        
        
        Assert.assertEquals(23, p.verificarIdade(p.getAnoNascimento()));
        
    }
    
}
