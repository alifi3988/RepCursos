
import jdk.jfr.Name;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alifi
 */

@TestMethodOrder(TestMethodOrder.OrderAnnotation.class)
public class OrdemAnotation {
    
    //Com o anotation @Order, irá ordernar a sequência de execução
    @Order(3)
    @Test
    void validarFluxoA(){
        System.out.println("3");
    }
    
    @Order(2)
    @Test
    @DisplayN
    void validarFluxoB(){
        System.out.println("2");
    }
    
    
    @Order(1)
    @Test
    void validarFluxoC(){
        System.out.println("1");
    }
    
    
}
