/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Bank bjb = new Bank (120000);

        bjb.getSaldo();
        bjb.simpanUang(500000);
        bjb.ambilUang(90000);
    }
    
}
