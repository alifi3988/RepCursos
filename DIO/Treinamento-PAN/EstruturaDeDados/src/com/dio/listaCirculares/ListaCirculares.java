/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.listaCirculares;

public final class ListaCirculares<T> {
    
    int tamanhoLista;
    No<T> referenciaCauda;
    No<T> referenciaCabeca;
    
    public ListaCirculares() {
        setTamanhoLista(0);
        setReferenciaCauda(null);
        setReferenciaCabeca(null);
    }

    public ListaCirculares(No<T> proximoNo) {
        setTamanhoLista(1);
        setReferenciaCauda(proximoNo);
        setReferenciaCabeca(getReferenciaCauda());
    }

    public No<T> getReferenciaCauda() {
        return referenciaCauda;
    }

    public int getTamanhoLista() {
        return this.tamanhoLista;
    }

    public void setReferenciaCauda(No<T> referenciaCauda) {
        this.referenciaCauda = referenciaCauda;
    }

    public void setTamanhoLista(int n) {
        this.tamanhoLista =+ n;
    }

    public No<T> getReferenciaCabeca() {
        return referenciaCabeca;
    }

    public void setReferenciaCabeca(No<T> referenciaCabeca) {
        this.referenciaCabeca = referenciaCabeca;
    }
    
    
    
    //verificação se está vazio
    public Boolean isEmpty(){
        return getTamanhoLista() <= 0;
    }
    
    public int size(){
        return getTamanhoLista();
    }
    
    private No<T> getNo(int index){
        
        if(verificarIndex(index)){
            if(isEmpty()){
                throw  new IndexOutOfBoundsException("Lista vazia");
            }else{
                if(index == 0){
                    return this.getReferenciaCauda();
                }
            }
            No<T> noAuxiliar = this.getReferenciaCauda();
            for(int i = 0; (i < index) && (noAuxiliar != null); i++){
                noAuxiliar = noAuxiliar.getProxRef();
            }
            return noAuxiliar;
        }
        return null;
    }
   
    public void add(T elemento){
        No<T> auxilirNo = getReferenciaCauda();
        if(isEmpty()){
            auxilirNo.setConteudo(elemento);
        }else{
            for(int i = 0; i < getTamanhoLista();i++){
                auxilirNo = auxilirNo.getProxRef();
            }
            auxilirNo.setConteudo(elemento);
        }
        setTamanhoLista(1); //acrescentando +1 no tamanho da lista 
    }
    
    private Boolean verificarIndex(int i){
        
        return !(i>getTamanhoLista() || i < 0);
    }
    
    public T get(int index){
        return this.getNo(index).getConteudo();
    }
    
    public void remove(int index){
        
        if(verificarIndex(index)){
            
            No<T> noAuxiliar = getReferenciaCauda();
            switch (index) {
                case 0 -> {
                    setReferenciaCauda(getReferenciaCauda().getProxRef());
                    getReferenciaCabeca().setProxRef(getReferenciaCauda());
                }
                case 1 -> getReferenciaCauda().setProxRef(getReferenciaCauda().getProxRef().getProxRef());
                default -> {
                        for(int i = 0; i < index-1; i++){
                                noAuxiliar = noAuxiliar.getProxRef();
                                }   noAuxiliar.setProxRef(noAuxiliar.getProxRef().getProxRef());
                }
            }
            setTamanhoLista(-1);

        }else{
            
            throw  new IndexOutOfBoundsException("Index informado não é compatível!");
        }
        
    }
    
    public void add(){
        No<T> novoNo = new No<>();
        
        if(!isEmpty()){
            setReferenciaCabeca(novoNo);
            setReferenciaCauda(getReferenciaCabeca());
            getReferenciaCabeca().setProxRef(getReferenciaCauda());
            
            
            
        }else{
            novoNo.setProxRef(getReferenciaCauda());
            getReferenciaCabeca().setProxRef(novoNo);
            setReferenciaCauda(novoNo );
        }
        
        setTamanhoLista(1);
    }

    @Override
    public String toString() {
        
        String strRetorno = "";
        
        No<T> auxiliar = getReferenciaCauda();
        
        for(int i = 0; i< size();i++){
            strRetorno += "[No{conteudo=" + auxiliar.getConteudo() + "}] ==> ";
            auxiliar = auxiliar.getProxRef();
        }
        
        strRetorno += isEmpty() ? " [[RETORNO INÍCIO]]" : " [NULL]";
        
        return strRetorno; 
        
    }
    
    
    
    
    
    
    
    
    
    
}
