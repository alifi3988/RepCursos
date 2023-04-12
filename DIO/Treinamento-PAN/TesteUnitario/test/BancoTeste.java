
import com.dio.testeJUnit.ConexaoBancoDados;
import com.dio.testeJUnit.Pessoa;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alifi
 */
public class BancoTeste {
    
    @BeforeAll
    void configurarConexao(){
        ConexaoBancoDados.iniciarConexaoBanco();
    }
    
    @BeforeEach
    void addPessoaBanco(Pessoa pessoa){
        ConexaoBancoDados.adicionarPessoaBanco(pessoa);
    }
    
    @AfterEach
    void removerPessoaBanco(Pessoa pessoa){
        ConexaoBancoDados.removerPessoaBanco(pessoa);
    }
    
    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }
    
    @AfterAll
    void fecharConexaoBanco(){
        ConexaoBancoDados.fecharConexaBanco();
    }
    
    
    
}
