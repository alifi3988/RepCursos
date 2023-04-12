
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alifi
 */
public class CheckedException {
    public static void main(String[] args) {
        
        
        String nomeDoArquivo = "house-of-the-Dragon.txt";
        
        try {
            imprimirArquivoNoCOnsole(nomeDoArquivo);
        } catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }      
        catch (IOException io) {
            JOptionPane.showMessageDialog(null, "Erro: " + io.getMessage());
        }
        
        
        System.out.println("Apesar da exception ou não, o programa continua....");
        
    }

    private static void imprimirArquivoNoCOnsole(String nomeDoArquivo) throws FileNotFoundException, IOException {
        
        File file = new File(nomeDoArquivo); //criação do arquivo
        
        //criação do Buffered para armazenar os dados temporário do arquivo
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
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
    
}
