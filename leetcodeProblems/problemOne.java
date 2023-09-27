
    /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]*/

import java.util.Scanner;
public class problemOne {
    public static void main(String args[]){
        Scanner obj= new Scanner(System.in);
        int i,j,target,size;
        System.out.println("Enter size of array");
        size=obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter your Array");
        for(i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("Enter your target variable");
        target=obj.nextInt();

        for(i=0;i<arr.length;i++){
              for(j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("["+i+","+j+"]");
                }
              }
        }  
   obj.close();
 }
    
}

