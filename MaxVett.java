/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricorsione;

/**
 *
 * @author Paolo
 */
public class MaxVett {
    public static int maxVett(int[] lista, int l){
        int max;
        if(l == lista.length-1 ) 
            return lista[l];
        else{
            max = maxVett(lista, l+1);
            if(lista[l] > max)
                max = lista[l];
            }
        return max;
    }    
}
