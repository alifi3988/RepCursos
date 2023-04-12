
//esse foi realizado com base nos outros que foi realizado nas vídeos aulas da DIO.
package com.dio.filaDuplamenteEncadeada;

/**
 *
 * @author alifi
 * @param <T>
 */
public final class NoDuplo<T> {
    
    
    private T conteudo; //no caso, coloquei como ibject para deixar aberto para o tipo que irá add
    private NoDuplo<T> referenciaProximoNo;
    private NoDuplo<T> referenciaAnteriorNo;

    public NoDuplo() {
        setReferenciaProximoNo(null);
        setReferenciaAnteriorNo(null);
    }

    public NoDuplo(T conteudo) {
        setConteudo(conteudo);
        setReferenciaProximoNo(null);
        setReferenciaAnteriorNo(null);
    }

    public NoDuplo(T conteudo, NoDuplo referenciaProximoNo, NoDuplo referenciaAnteriorNo) {
        setConteudo(conteudo);
        setReferenciaProximoNo(referenciaProximoNo);
        setReferenciaAnteriorNo(referenciaAnteriorNo);
    }

    public T getConteudo() {
        return conteudo;
    }

    public NoDuplo<T> getReferenciaAnteriorNo() {
        return referenciaAnteriorNo;
    }

    public NoDuplo<T> getReferenciaProximoNo() {
        return referenciaProximoNo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public void setReferenciaAnteriorNo(NoDuplo<T> referenciaAnteriorNo) {
        this.referenciaAnteriorNo = referenciaAnteriorNo;
    }

    public void setReferenciaProximoNo(NoDuplo<T> referenciaProximoNo) {
        this.referenciaProximoNo = referenciaProximoNo;
    }

    @Override
    public String toString() {
        String str;
        
        str = "No{Conteudo: " + getConteudo()
                + "Nó Anterior: " + getReferenciaAnteriorNo().getConteudo()
                + "Nó Próximo : " + getReferenciaProximoNo().getConteudo() + "}";
        return str;
    }

}
