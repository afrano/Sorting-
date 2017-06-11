package sorting;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class NewClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Insertion Sort");
        int data[] = {23, 56, 45, 12, 67, 86, 43, 66, 99, 25, 61, 5, 78, 76, 33, 63, 5, 8, 15, 20};
        //prose isertion sort
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i;
            while (j > 0 && data[j - 1] > key) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = key;
        }
        //hasil pengurutan
        System.out.print("Data yang telah urut : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

    }

}
