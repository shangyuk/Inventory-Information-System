/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineMovie;

/**
 *
 * @author asus
 */
class SelectionSort {
    
    public static void sort(String a[][]) {
        for(int i =0; i<=a.length-1; i++){
            int lowestIndex = lowestValue(a,i);
            String [] temp  = a[lowestIndex];
            a[lowestIndex] =a[i];
            a[i]=temp;
//            System.out.println(lowestIndex);
        }
    }

    public static int lowestValue(String a[][], int from){
       int minPos = from;
       for (int i= from+1; i < a.length; i++){
           if (Integer.parseInt(a[i][5])<Integer.parseInt(a[minPos][5])){
                minPos=i;
            }
        }
        return minPos;
    }

}
