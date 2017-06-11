package sorting;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class Insertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Insertion Sort");
        int data[] = {23, 56, 45, 12, 67, 86, 43, 66, 99, 25, 61, 5, 78, 76, 33, 63, 5, 8, 15, 20};

        for (int iter = 1; iter < data.length - 1; iter++) {
            int minindek = iter;
            for (int n = iter + 1; iter < data.length - 2; iter++) {

                if (data[n] < data[minindek]);
                {
                    minindek = n;
                }
            }int temp= data[iter];
            data[iter]=data[minindek];
            data[minindek]=temp;
        }
        for (int idx=0; idx<=data.length-1;idx++){
            System.out.println("data ke-"+idx+" = "+data[idx]);
        }

    }

}

        