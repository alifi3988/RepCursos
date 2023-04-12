
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
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
public class ExceptionCustomizada {
    public static void main(String[] args) {
        
        
        String nomeDoArquivo = "house-of-the-Dragon.txt";
        
        try {
            imprimirArquivoNoCOnsole(nomeDoArquivo);
        } catch(FileNotFoundException | ImporssiveAberturaDeArquivoException  e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }      
        catch (IOException io) {
            JOptionPane.showMessageDialog(null, "Erro: " + io.getMessage());
        }
        
        
        System.out.println("Apesar da exception ou não, o programa continua....");
        
    }

    private static void imprimirArquivoNoCOnsole(String nomeDoArquivo) throws FileNotFoundException, IOException, ImporssiveAberturaDeArquivoException {
        
        File file = new File(nomeDoArquivo); //criação do arquivo
        
        //criação do Buffered para armazenar os dados temporário do arquivo
        BufferedReader br = lerRquivo(nomeDoArquivo);
        String line = br.readLine();
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while(line != null);
        
        bw.flush();
        br.close();
        

    }
    
    public static BufferedReader lerRquivo(String nomeDoArquivo) throws ImporssiveAberturaDeArquivoException{
    
        File file = new File(nomeDoArquivo);
        
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImporssiveAberturaDeArquivoException(nomeDoArquivo, file.getPath());
        }
        
    }
    
}

class ImporssiveAberturaDeArquivoException extends Exception{
    
    private final String nomeDoArquivo;
    private final String diretorio;

    public ImporssiveAberturaDeArquivoException(String nomeDoArquivo, String diretorio) {
        
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImporssiveAberturaDeArquivoException{" +
               "nomeDoArquivo=" + nomeDoArquivo +
               ", diretorio=" + diretorio + '}';
    }

}
