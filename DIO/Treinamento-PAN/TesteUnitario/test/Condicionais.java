
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alifi
 */
public class Condicionais {
    
    //se o usuário bater com o solicitado, ele irá fazer a verificaçã
    @Test
    @EnabledIfEnviromantVariable(name="USER", matches="Willian")
    void validarAlgoSeUsuarioForWillian(){
        System.out.println("É o Willian");
    }
    
    //irá relizar se o usuário não bater com o solicitado    
    @Test
    @DisableIfEnviromantVariable(name="USER", matches="Willian")
    void validarAlgoSeUsuarioForWillian(){
        System.out.println("É o Willian");
    }
    
}
