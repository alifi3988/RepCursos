
package com.dio.pilha;

/**
 *
 * @author alifi
 */
public class No {
    
    private int dado;   
    private No refNo = null;

    
    //contrutores
    public No(int dado) {
        super();
        this.dado = dado;
    }

    public No() {
    }
    
    //gets e sets

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No reNo) {
        this.refNo = reNo;
    }

    @Override
    public String toString() {
        return "No {"
                + " Dado: " + getDado()
                + "}";
    }
    
    
    
    
    
    
}
