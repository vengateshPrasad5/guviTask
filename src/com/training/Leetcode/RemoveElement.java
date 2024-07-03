package com.training.Leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums  = {3, 2, 2, 3};
        int result = removeElement(nums,3);
        System.out.println("result = " + result);
    }
    public static int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
           if(nums[i] != val){
               nums[result] = nums[i];
               result++;
           }
        }
        return result;
    }
}
