package com.dio.fila;

/**
 *
 * @author alifi
 */

//PRIMEIRO A ENTRAR, É O PRIMEIRO A SAIR
public class FilaI {
    
    private No refEntradaNo;
    
    
    //CONTRUTORES DA CLASSE
    public FilaI() {
    }
    public FilaI(No refProximoNo) {
        super();
        this.refEntradaNo = null;
    }

    //MÉTODOS GETS E SETS
    public No getRefEntradaNo() {
        return refEntradaNo;
    }
    public void setRefEntradaNo(No refProximoNo) {
        this.refEntradaNo = refProximoNo;
    }
    
    
    //MÉTODOS DE AÇÕES DA FILA
    
    //verificação se está vazio
    public Boolean isEmpty(){
        return getRefEntradaNo() == null;
    }
    
    //Adicionar na fila
    public void enqueue(No novoNo){
        novoNo.setRefNo(getRefEntradaNo());
        setRefEntradaNo(novoNo);
    }
    
    //Verificar o primeiro item
    public No first(){
        
        if(!this.isEmpty()){
            
            No primeiroNo = refEntradaNo;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
        }
        
        return null;
    }
    
    
    //Remover da fila
    public No dequeue(){
        
        if(!this.isEmpty()){
            
            No primeiroNo = refEntradaNo;
            No noAuxiliar = refEntradaNo;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        
        return null;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No auxiliar = refEntradaNo;

        while(true){
            if(refEntradaNo!= null){
                strRetorno += "[No{Objeto = " + auxiliar.getObjeto() + "}] => ";
                
                if(auxiliar.getRefNo() != null){
                    auxiliar = auxiliar.getRefNo();
                }else{
                    strRetorno += "null";
                    break;
                }
            }else{
                break;
            }
        }
        return strRetorno; 
    }
    
    
}
