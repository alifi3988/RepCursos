package com.dio.pilha;

/**
 *
 * @author alifi
 */

//PRIMEIRO A ENTRAR, ULTIMO A SAIR
public class Pilha {
    
    private No refNoEntradaPilha;

    
    public Pilha() {
    }

    
    public Pilha(No refNoEntradaPilha) {
        this.refNoEntradaPilha = null;
    }
    
    
    //métodos da pila
    public boolean isEmpty(){
        return refNoEntradaPilha == null;
    }
    
    
    public No top(){
        return this.refNoEntradaPilha;
    }
    
    
    //recebendo um No para add na lista
    public void push(No novoNo){
        No auxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        //realizando o empilhamento com o apontamento do nó
        refNoEntradaPilha.setRefNo(auxiliar); 
    }
    
    
    public No pop(){
        if(!isEmpty()){
            No auxiliar = refNoEntradaPilha; //No auxuliar
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return auxiliar;
        }
        return null;
    } 

    
    @Override
    public String toString() {
        String strReturn = "-------------------\n";        
        strReturn += "Pilha\n";
        strReturn += "-------------------\n";
        No auxiliar = this.refNoEntradaPilha;
        
        while(true){
            if(auxiliar == null) break;
            strReturn += "[No{dado= " + auxiliar.getDado() + "}]\n";
            auxiliar = auxiliar.getRefNo();
        }
        strReturn += "-------------------\n";
        return strReturn;
        
    }
}
