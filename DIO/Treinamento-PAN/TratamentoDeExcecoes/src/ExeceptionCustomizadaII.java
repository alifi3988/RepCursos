
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alifi
 */
public class ExeceptionCustomizadaII {
    public static void main(String[] args) {
        
        
        int[] numerador = {4,5,8,10};
        int[] denominador = {2,4,0,2,8};
        int resultado = 0;
        
        for(int i = 0; i < denominador.length; i++){
            
            try {
                if(numerador[i] %2 != 0)
                    throw new TratamentoDeDivisaoException(
                        numerador[i],
                        denominador[i],
                        "Divisão não é exata!");
                resultado = numerador[i] / denominador[i];
                System.out.println(resultado);

            } catch (TratamentoDeDivisaoException | ArithmeticException | ArrayIndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        }
        System.out.println("O programa continua...");
    }
    
}



