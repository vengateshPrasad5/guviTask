package com.training.codekata.java;

import java.util.*;

import static java.util.Arrays.asList;

public class NearestNumber {
    /*
    Given two numbers N,K and an array of size N, print the three nearest neighbours of K
    (nearest neighbours are numbers which have least difference with K).
    Input Size : 4 <= N, K <= 100000
    Sample Testcases :
    INPUT
    5 3
    1 2 3 4 6
    OUTPUT
    2 4 1
    */
    public static void main(String[] args) {
     List<Integer> n = asList(1,2,3,4,6); // 3 1 2 4 5
//        List<Integer> n =  new ArrayList<>();
//        n.addAll(n1);
     int k  = 3;
//        Map<Integer,Integer> map = new HashMap<>();
//     int kIndex = n.indexOf(k);
////            nearest number
//            int right = n.get(kIndex+1);
//            int left = n.get(kIndex-1);
        Scanner scanner = new Scanner(System.in);

//        int N = scanner.nextInt();
//        int K = scanner.nextInt();
//        // Read the array
//        int[] array = new int[N];
//        for (int i = 0; i < N; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        // Calculate absolute differences
//        int[] differences = new int[N];
//        for (int i = 0; i < N; i++) {
//            differences[i] = Math.abs(array[i] - K);
//        }
//
//        // Create a list of indices and sort it based on differences
//        List<Integer> indices = new ArrayList<>();
//        for (int i = 0; i < N; i++) {
//            indices.add(i);
//        }
//        indices.sort(Comparator.comparingInt(i -> i));
//
//        // Print the three nearest neighbors
//        for (int i = 0; i < Math.min(3, N); i++) {
//            System.out.print(array[indices.get(i)] + " ");
//        }
//        int left = 0; // 0
//        int right = n.size() - 1; // 5 ;4 ;3 ;2
//        while (right - left >= k) { // 5 >= 3 ;4 >= 3 3 >=3; 2>=3
//            // Compare absolute differences between target and elements
//            // at left and right pointers
//            // Move the pointers closer to the target by updating left/
//            // right based on the closest element
//            if (Math.abs(n.get(left) - k) > Math.abs(n.get(right) - k)) { // 2 > 3 // 1 > 2 // 0 > 1
//                left++;
//            } else {
//                right--;
//            }
//        }
//
//
//        // Print the k closest elements
//        while (left <= right) { //0 <= 2 1<=2
//            System.out.print(n.get(left) + " "); // 2 ; 3 ; 4
//            left++;
//        }
        System.out.println(findClosestElements(n,3,3));
    }
    public static List<Integer> findClosestElements(List<Integer> arr, int k, int x) {
        //-------- Main idea behind the binary search algorithm ----------//
        // 1) res will be a consecutive subarray of k size
        // 2) say if we need to pick 4 elems, now we r looking at 5 elem n1, n2, n3, n4, n5
        //    we need to compare two ends: diff(x, n1) and diff(x, n5),
        //    the number with bigger diff on the end will be eleminated
        //----------------------------------------------------------------//
        // lo and hi: range of all possible start of subarray with size k + 1, so we could compare both ends
        int lo = 0, hi = arr.size() - k - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            // for subarray starting at mid with size k+1, we compare element of two ends to eliminate the loser
            if (Math.abs(x - arr.get(mid)) > Math.abs(x - arr.get(mid+k))) {
                // arr[mid] is the one further away from x, eliminate range[lo, mid]
                lo = mid + 1;
            } else {
                // arr[mid+k] is the one further away, all [mid, hi] will have simiar situation, elimiate them
                hi = mid - 1;
            }
        }
        // return subarray
        List<Integer> res = new ArrayList(k);
        for (int i = 0; i < k; i++) {
            res.add(arr.get(lo + i));
        }
        return res;
    }
}
