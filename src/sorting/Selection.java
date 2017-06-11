/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author basisb15
 */
public class Selection {
 public static void main(String[] args) {
        int[] data = {23,56,45,12,67,86,43,66,99,25,61,5,78,76,33,63,5,8,15,20};
        int tam = 0;
        for (int iter = 0; iter < data.length; iter++) {
            for (int elem = iter + 1; elem < data.length; elem++) {
//                System.out.println("\nmembandingkan "+data [iter] + " dengan " + data[elem]);
//                System.out.print("indek awal [iter] : " + data[iter] + "lalu");
                if (data[iter] > data[elem]) {
                    tam = data[iter];
                    data[iter] = data[elem];
                    data[elem] = tam;
                }
            }
              System.out.println("Iterasi :"+iter+"");
        for (int n = 0; n <=data.length-1; n++) {
                System.out.print(data[n]+" ");
        }
        System.out.println(" ");
        }
        System.out.println("Hasil");        
        for (int n = 0; n <=data.length-1; n++) {
                System.out.print(data[n]+" ");
            }       
    }}
