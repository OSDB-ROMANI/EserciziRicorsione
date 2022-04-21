package ricorsione;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paolo
 */
public class Fattoriale {
    public static int Fatt(int n){
        if(n>1){
            n = n * Fatt(n-1);
        }else
            return 1;
        return n;
    }
    
    public static void stampaFattoriale(int x){
        System.out.println("FATTORIALE\n"
                         + " i | valore\n"
                         + "-----------");
        for(int i = 1; i < x; i++){
            System.out.println(" "+i+" |  "+Fatt(i));
        }
    }    
}
