/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumvectores;

import java.util.Scanner;

/**
 *
 * @author yudy-
 */
public class SumVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea= new Scanner(System.in);
        System.out.println("Digite tamño del vector");
        int i,n;
        int vec[]=new int[100];
        n= lea.nextInt();
        i=0;
        while(i<n){
            System.out.println("vec["+i+"]=");
            vec[i]=lea.nextInt();
            i=i+1;
        }
        System.out.println("suma del vector="+vector(vec,n-1));
                
    }
    public static int vector(int A[], int num){
        if (num==0){
            return A[num];
            
        }else{
            return A[num]+vector(A, num-1);
        }
    }
    
    
}
