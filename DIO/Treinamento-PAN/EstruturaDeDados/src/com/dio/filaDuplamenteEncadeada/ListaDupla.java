package com.dio.filaDuplamenteEncadeada;

/**
 *
 * @author alifi
 * @param <T>
 */
public final class ListaDupla<T> {
    
    // no caso esse é o de entrada, ou seja, ele que vai armazenar o anterior e o posterior
    private NoDuplo<T> refEntrada; 
    private NoDuplo<T> refUltimo;
    private int tamanhoLista; //criação da variavel para facilitar a verificação do tamanho da lista
    
    //construtores

    public ListaDupla() {
        super();
        setRefEntrada(null);
        setRefUltimo(null);
        setTamanhoLista(0);
    }

    //MÉTODOS GETS E SETS
    public NoDuplo<T> getRefEntrada() {
        return refEntrada;
    }

    public void setRefEntrada(NoDuplo<T> refEntrada) {
        this.refEntrada = refEntrada;
    }

    //gets e sets do tamanho da lista
    public int getTamanhoLista() {
        return tamanhoLista;
    }

    //realizando a criação de dois métodos iguais
    public void setTamanhoLista() {
        this.tamanhoLista++;
    }
    public void setTamanhoLista(int tamanho) {
        this.tamanhoLista = this.tamanhoLista + (tamanho);
    }

    public NoDuplo<T> getRefUltimo() {
        return refUltimo;
    }

    public void setRefUltimo(NoDuplo<T> refUltimo) {
        this.refUltimo = refUltimo;
    }

    
    //MÉTODOS DE AÇÕES DA LISTA
    
    //verificando o tamanho da Lista
    public int size(){
        return getTamanhoLista();
    }
    
    //verificação se está vazia
    public Boolean isEmpty(){
        return refEntrada.getConteudo() == null;
    }
    
    //pegando o nó pelo index
    private NoDuplo<T> getNo(int index){
        
        NoDuplo<T> noAuxiliar = getRefEntrada();
        
        for(int i = 0; (i<index) && (noAuxiliar != null);i++){
            noAuxiliar = noAuxiliar.getReferenciaProximoNo();
        }
        return noAuxiliar;
    }
    
    public T get(int index){
        return this.getNo(index).getConteudo();
    }    

    //adicionando somente o elemento(conteudo)
    public void add(T conteudo){
        
        NoDuplo<T> novoConteudo = new NoDuplo<>(conteudo);
        
        novoConteudo.setReferenciaProximoNo(null);
        novoConteudo.setReferenciaAnteriorNo(getRefUltimo());
        
        if(getRefEntrada() == null){
            setRefEntrada(novoConteudo);
        }else{
            setRefUltimo(novoConteudo);
        }
        setRefUltimo(novoConteudo);
        setTamanhoLista(); //incrementando o valor da lista (size)
    }
    
    public void add(T conteudo, int index){
        
        if(verificarIndex(index)){
            System.out.println("Impossível realizar a inserção!");
            return;
        }
        
        NoDuplo<T> novoConteudo = new NoDuplo<>(conteudo);
        NoDuplo<T> auxiliar = getNo(index);
        
        novoConteudo.setReferenciaProximoNo(auxiliar);
        
        if(novoConteudo.getReferenciaProximoNo() != null){
            novoConteudo.setReferenciaAnteriorNo(auxiliar.getReferenciaAnteriorNo());
            novoConteudo.getReferenciaProximoNo().setReferenciaAnteriorNo(novoConteudo);
        }else{
            novoConteudo.setReferenciaAnteriorNo(getRefUltimo());
            setRefUltimo(novoConteudo);
        }
        
        if(index == 0){
            setRefEntrada(novoConteudo);
        }else{
            novoConteudo.getReferenciaAnteriorNo().setReferenciaProximoNo(novoConteudo);
        }
        setTamanhoLista();
    }
    
    
    public Boolean remove(int index){
        
        if(verificarIndex(index)){
            System.out.println("Falha ao remover");
            return false;
        }else{
            if (index == 0){
                setRefEntrada(getRefEntrada());
                if(getRefEntrada() != null){
                    setRefEntrada(null);
                }
           }else{
                NoDuplo<T> noAuxiliar = getNo(index);
                noAuxiliar.getReferenciaAnteriorNo().setReferenciaProximoNo(noAuxiliar.getReferenciaProximoNo());
                if(noAuxiliar != getRefUltimo()){
                    noAuxiliar.getReferenciaProximoNo().setReferenciaAnteriorNo(noAuxiliar.getReferenciaAnteriorNo());
                }else{ 
                    setRefUltimo(noAuxiliar);
                }
            }
        } 
        setTamanhoLista(-1);
        return true;
    }
    
   private Boolean verificarIndex(int index){
       return !(index < 0 || index > this.size()-1);
   }

    @Override
    public String toString() {
        String str = "";
        NoDuplo<T> noAuxiliar = getRefEntrada();
        
        if(noAuxiliar == null){
            System.out.println("Vazio");
            return null;
        }
        
        for(int i = 0; i < size(); i++){
            str+= "[No{Conteudo = " + noAuxiliar.getConteudo() + "}] => ";
            noAuxiliar = noAuxiliar.getReferenciaProximoNo();

        }
        str+= "Null";
        return str;
    }
    
   
    
    
    
    
    
    
    
}
