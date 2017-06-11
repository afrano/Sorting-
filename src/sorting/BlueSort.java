/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;
public class BlueSort {
    public static void main(String[] args) {
     int data[]= {23,56,45,12,67,86,43,66,99,25,61,5,78,76,33,63,5,8,15,20};
     //langkah 1
        for (int iter=1; iter<data.length-1; iter++) {
            //langkah 2
            for(int elm=0; elm<=data.length-1-iter; elm++){
                //langkah 3
                if (data[elm]>data[elm+1]){
                    int temp = data [elm];
                    data[elm] = data[elm+1];
                    data[elm+1] = temp;
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
    