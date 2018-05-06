/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroatm;

/**
 *
 * @author PC-01
 */
public class Si {
    
    public static void main(String[] args) {
    int si[]= new int [2];
    si[0]=1;
    si[1]=2;
        for (int i = 0; i < si.length; i++) {
            if (si[i]<2){
                si[i]=6;
            }
        }
        for (int i = 0; i < si.length; i++) {
            System.out.println(si[i]);
        }
    }
}
