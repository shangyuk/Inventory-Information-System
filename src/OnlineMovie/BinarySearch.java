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
public class BinarySearch {
     public static int search( String a[][], int first, int last, int value) {
        if (last >= first) { 
            int mid = (first+last)/2; 
  
            // If the element is present at the 
            // middle itself 
            if (Integer.parseInt(a[mid][5]) == value) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (Integer.parseInt(a[mid][5]) > value) 
                return search(a, first, mid - 1, value); 
  
            // Else the element can only be present 
            // in right subarray 
            return search(a, mid + 1, last, value); 
        } 
        return -1;
     }
}