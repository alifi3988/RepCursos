package com.dio.lista;

//implementando a classe nó de modo genérico
public final class No<T> {
    
    private T       conteudo;
    private No      referenciaProxNo;

    
    //CONSTRUTORES
    public No() {
        setReferenciaProxNo(null);
    }

    public No(T conteudo) {
        setConteudo(conteudo);
        setReferenciaProxNo(null);
    }

    public No(T conteudo, No referenciaProxNo) {
        setConteudo(conteudo);
        setReferenciaProxNo(referenciaProxNo);
    }

    //GETS E SETS
    public No getReferenciaProxNo() {
        return referenciaProxNo;
    }

    public void setReferenciaProxNo(No referenciaProxNo) {
        this.referenciaProxNo = referenciaProxNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        String str = "No{" + 
                "conteudo=" + getConteudo() + "}";
        
        
        return str;
    }

    public String toStringEncadeado(){
        
        String str = "No{" + 
                "conteudo=" + getConteudo() + "}";
        
        if(referenciaProxNo == null){
            str = str + " => NULL";
        }else{
            str += " => " + getReferenciaProxNo().toString();
        }
        
        return str;
    }
    
    

}
