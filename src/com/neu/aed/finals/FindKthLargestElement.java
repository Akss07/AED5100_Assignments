package com.neu.aed.finals;

/**
 *  Question 5: Given an integer array num and an integer k, return the kth largest element in the array.
 */
public class FindKthLargestElement {
    int[] num;
    int k_smallest;

    public int findKthLargest(int[] nums, int k) {
        int k_smallest = nums.length - k;
        this.num = nums;
        this.k_smallest = k_smallest;
        return quickSelect(0, nums.length-1);
    }

    public int quickSelect(int left, int right){ // using Quick Select algorithm
        while (left<right)
        {
            int i = partition(left, right);
            if(i==k_smallest){
                return num[i];
            }else if (i < k_smallest){
                left = i+1;
            }else{
                right=i-1;
            }
        }
        return num[left];
    }

    public int partition(int left, int right){
        int i = left-1;
        int j = left;
        int partitionIndex = right;

        while(j < right){
            if(num[partitionIndex] > num[j]){
                i++;
                swap(i,j);
                j++;
            }else{
                j++;
            }
        }
        swap(i+1, partitionIndex);
        return ++i;
    }

    public void swap(int left, int right){
        int temp = num[right];
        num[right] = num[left];
        num[left] = temp;
    }
}
