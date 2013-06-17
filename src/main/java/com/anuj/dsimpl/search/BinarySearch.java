package com.anuj.dsimpl.search;

import com.anuj.dsimpl.algorithm.Sort;

/**
 * Write a program in programming language of your choice to perform binary
 * com.anuj.dsimpl.search on an array. Assume that array is sorted.Extra credit:
 * discuss the solution for a case when array is not sorted and whether it
 * affects complexity.
 * 
 * @author anujku
 * 
 */
public class BinarySearch {

  static boolean search(int[] intArray, int num) {
    if (intArray != null) {
      for (int i = 0; i < intArray.length; i++) {
        if (intArray[i] == num)
          return true;
      }
    }
    return false;
  }

  static boolean binarySearch(int[] intArray, int num) {
    if (intArray != null) {
      intArray = Sort.sort(intArray);
      int low = 0;
      int high = intArray.length - 1;

      while (high >= low) {
        int mid = low + (low + high) / 2;
        if ((intArray[mid] == num))
          return true;
        else if (num < intArray[mid]) {
          if (num == mid - 1)
            return true;
          high = mid - 1;
        } else if (num > intArray[mid]) {
          if (num == mid + 1)
            return true;
          low = mid + 1;
        }
      }
    }
    return false;
  }

  public static int binarySearch(int[] arr, int fIndex, int lIndex, int search) {

    int middle = (fIndex + (lIndex - fIndex) / 2);

    if (fIndex < lIndex) {

      if (search == arr[middle]) {

        return middle;
      }

      else if (search < arr[middle]) {
        if (search == arr[0])
          return 0;
        return binarySearch(arr, fIndex, middle, search);
      }

      else if (search > arr[middle]) {
        if (search == arr[middle + 1])
          return middle + 1;
        return binarySearch(arr, middle + 1, lIndex, search);
      }

    }
    return -1;
  }

  public static void main(String[] args) {
    int[] intArray1 = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };

    int[] intArray2 = { -1, 2, 4, 5, 6, 7, 8, 9, 11, 12, 14 };

    int[] intArray3 = { 21 };

    int[] intArray4 = {};

    int[] intArray5 = null;

    int num = 1;

    System.out.println(search(intArray1, num));
    System.out.println(binarySearch(intArray1, num));

    System.out.println(search(intArray2, num));
    System.out.println(binarySearch(intArray2, num));
    System.out.println(binarySearch(intArray2, 0, intArray2.length, num));

    System.out.println(search(intArray3, num));
    System.out.println(binarySearch(intArray3, num));

    System.out.println(search(intArray4, num));
    System.out.println(binarySearch(intArray4, num));

    System.out.println(search(intArray5, num));
    System.out.println(binarySearch(intArray5, num));
  }
}
