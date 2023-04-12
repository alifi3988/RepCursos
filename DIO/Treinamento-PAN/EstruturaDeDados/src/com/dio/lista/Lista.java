
package com.dio.lista;

public final class Lista<T> {
    
    No<T> referenciaEntrada;

    
    
    public Lista() {
        
        setReferenciaentrada(null);
    }

    public Lista(No<T> referenciaentrada) {
        this.referenciaEntrada = referenciaentrada;
    }
    
    //MÉTODOS GETS E SETS
    public No<T> getReferenciaentrada() {
        return referenciaEntrada;
    }

    public void setReferenciaentrada(No<T> referenciaentrada) {
        this.referenciaEntrada = referenciaentrada;
    }
    
    public Boolean isEmpty(){
        return getReferenciaentrada() == null;
    }
    
    //retorna o tamanho da lista
    public int size(){
        int tamanhoLista = 0;
        No<T> auxiliar = getReferenciaentrada();
        
        while(true){
            if(isEmpty()) break;
            else{
                tamanhoLista++;
                auxiliar = auxiliar.getReferenciaProxNo();
                if(auxiliar == null) break;
            }
        }
        return tamanhoLista;
    }
    
    
    public void add(T conteudo){
        
        No<T> novo = new No<>(conteudo);
        
        //se acavou de criar a lista, ela sempre será null, 
        //então esse primeiro valor add vai assumir como o primeiro valor da lista
        if(this.isEmpty()){
            referenciaEntrada = novo;
        }
        
        //se não, ele vai criar uma lista auxilair, onde vai receber o valor atual    
        
        else{
            
            No<T> noAuxiliar = referenciaEntrada;
            for(int i = 0; i<= this.size() -1; i++){
                noAuxiliar = noAuxiliar.getReferenciaProxNo();
            }
            noAuxiliar.setReferenciaProxNo(novo);
            //this.setReferenciaentrada(noAuxiliar);
        }  
        
        
    }
    
    //pegar um valor pelo index da lista, sem removê-lo
    private No<T> getNo(int index){ 
        
        if(index > this.size()) return null;
        else if(index < 0) return null;
        else if(this.isEmpty()) return null;
        else{
            
            No<T> auxiliar = referenciaEntrada;
            No<T> selIndex = null;
            
            for(int i = 0; i <= index; i++){
                selIndex = auxiliar;
                auxiliar = auxiliar.getReferenciaProxNo();
                
            }            
            return selIndex;

        } 
    }
    
    public T get(int index){
        return getNo(index).getConteudo();
    }
    
    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if(index == 0){
            referenciaEntrada = noPivor.getReferenciaProxNo();
            return noPivor.getConteudo();
        }else{
            No<T> noAnterior = getNo(index-1);
            noAnterior.setReferenciaProxNo(noPivor.getReferenciaProxNo());
            return noPivor.getConteudo();
        }
        
        
    }

    @Override
    public String toString() {
        String str = "";
        
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size();i++){
            str += "No{conteudo=" + noAuxiliar.getConteudo() + "}  ";
            noAuxiliar = noAuxiliar.getReferenciaProxNo(); 
        }
        str += "NULL";
        
        return str;
    }

    
    
    
}
