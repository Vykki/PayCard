/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s1601402
 */
public class Maksukortti {

    private double saldo;

    public Maksukortti(double alkusaldo) {
        // kirjoita koodia tähän
            saldo = alkusaldo;
        
    }

    public void syoEdullisesti() {
        // kirjoita koodia tähän
        if(saldo-2.5>=0){
        saldo-=2.5;
        }
    }

    public void syoMaukkaasti() {
        // kirjoita koodia tähän
        if(saldo-4.3>=0){
        saldo-=4.3;
        }
    }

    @Override
    public String toString() {
        // kirjoita koodia tähän
        return "Kortilla o rahaa " + saldo + " euroa";
    }

}
