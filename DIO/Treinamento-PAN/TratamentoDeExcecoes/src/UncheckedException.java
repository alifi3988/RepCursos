
import javax.swing.JOptionPane;

//para teste, iremos realizar a divizão de dois valores inteiros
public class UncheckedException {
    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");
        
        double resultado;
        try{
            resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
            
        }catch(NumberFormatException | ArithmeticException nfe){
            JOptionPane.showMessageDialog(
                    null, 
                    "Não foi possível realizar o cáclulo. \nErro: " + nfe.getMessage()
            );
        }
        

    }

    private static double dividir(int a, int b) {
        return a/b;
    }
    
}
