/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Bank {
    
    int saldoSaya;
    int total;
    Bank(int saldo){
        saldoSaya = saldo;
    }
    void getSaldo(){
        System.out.println("Selamat Datang Di Bank ABC");
        System.out.println("Saldo saat ini : Rp." + saldoSaya);    
    }
    void simpanUang(int simpan){
        total = simpan + saldoSaya;
        System.out.println("Simpan Uang: " + simpan);
        System.out.println("Saldo Saat Ini: Rp." + total);
    }
    void ambilUang(int ambil){
        int total2 = total-ambil;
        if(ambil<total2){
            System.out.println("Ambil Uang: " + ambil);
            System.out.println("Saldo Saat Ini; Rp."+total2);
        }else if (ambil>total2){
            System.out.println("Maaf Saldo Anda Tidak Cukup");
        }
    }
    
    
    
}
