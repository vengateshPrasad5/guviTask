package com.training.codekata.java;

// Java program to find k closest elements to a given value
class KClosest
{
    /* Function to find the cross over point (the point before
    which elements are smaller than or equal to x and after
    which greater than x)*/
    int findCrossOver(int arr[], int low, int high, int x)
    {
       int mid  = 0;

       while(low <= high){ // to avoid crossover
           mid = (low + high)/2; /* low + (high - low)/2 */
           if(x == arr[mid]){
               return mid;
           } else if (x < arr[mid]){ // 2 < 3
               high = mid-1;
           } else{
               low = mid+1;
           }
       }
        return -1;
    }

    // This function prints k closest elements to x in arr[].
    // n is the number of elements in arr[]
    void printKclosest(int arr[], int x, int k, int n)
    {
        // Find the crossover point
        int left = findCrossOver(arr, 0, n-1, x);
        int right = left+1; // Right index to search
        int count = 0; // To keep track of count of elements
        // already printed

        // If x is present in arr[], then reduce left index
        // Assumption: all elements in arr[] are distinct
        if (arr[left] == x) left--;

        // Compare elements on left and right of crossover
        // point to find the k closest elements
        while (left >= 0 && right < n && count < k)
        {
            if (Math.abs( arr[left] -x) > Math.abs(arr[right] - x))
                System.out.print(arr[right++]+" ");
            else
                System.out.print(arr[left--]+" ");
            count++;
        }

        // If there are no more elements on right side, then
        // print left elements
        while (count < k && left >= 0)
        {
            System.out.print(arr[left--]+" ");
            count++;
        }


        // If there are no more elements on left side, then
        // print right elements
        while (count < k && right < n)
        {
            System.out.print(arr[right++]+" ");
            count++;
        }
    }
    public static void main(String args[])
    {
        KClosest ob = new KClosest();
        int arr[] = {1,2,3,4,6};
        int n = arr.length;
        int x = 1, k = 3;
        ob.printKclosest(arr, x, k, n);
    }
}

