package com.dio.fila;

/**
 *
 * @author alifi
 * @param <T>
 */

//trabalhando com classe do tipo Genérico
public final class No<T>{
    
    private Object objeto;
    private No refNo;
    
    public No(Object objeto){
        this.refNo = null;
        this.objeto = objeto;
    }

    public Object getObjeto() {
        return objeto;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {        
        return "No{Objeto: " + getObjeto() + "}";
    }

    
    
    
    


}
