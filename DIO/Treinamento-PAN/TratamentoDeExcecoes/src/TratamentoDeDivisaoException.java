/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alifi
 */
public class TratamentoDeDivisaoException extends Exception{
    
    private final int numerador;
    private final int denominador;

    public TratamentoDeDivisaoException(int numerador, int denominador, String msg) {
        super(msg);
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "TratamentoDeDivisaoException{" + "numerador=" + numerador + ", denominador=" + denominador + '}';
    }

}
