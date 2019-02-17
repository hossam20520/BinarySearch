/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.search.array;

/**
 *
 * @author Hossam
 */
public class BinarySearchArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {1,2,3,4,5,40,50,60};
        System.out.println(binarySearch(array, 50));
        
    }
    
    public static int binarySearch(int[] list, int key){
       int low =0;
       int high = list.length - 1;
       System.out.println(7/2);
       while(high >= low){
           int mid = (low + high) /2;
           if(key < list[mid])
               high = mid - 1;
           else if(key == list[mid])
               return mid;
           else 
               low = mid + 1;
       }
       return  -1;
    }
    
}
