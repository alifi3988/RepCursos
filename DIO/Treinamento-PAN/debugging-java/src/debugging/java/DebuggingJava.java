
package debugging.java;

public class DebuggingJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Inicou o programa no método main");
        
        a();
        
        System.out.println("Finalizou o programa do método main");
       
    }
    
    
    static void a(){
        System.out.println("Entou no método a");
        b();
        System.out.println("Finalizou o método a");
    }

    private static void b() {
        System.out.println("Entrou no método b");
        for(int i = 0; i <=4; i++){
            System.out.println("Nº: " + i);
        }
        c();
        System.out.println("Finalizou o método b");
    }

    private static void c() {
        System.out.println("Entrou no método C");
        //Thread.dumpStack();
        System.out.println("Finalizou o método C");
    }
    
}
