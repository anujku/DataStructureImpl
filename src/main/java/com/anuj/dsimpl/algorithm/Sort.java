package com.anuj.dsimpl.algorithm;

public class Sort {
  public int[] myMergeSort(int[] data) {
    int dataLength = data.length;

    if (dataLength <= 1)
      return data;
    else {
      int[] merged = new int[dataLength];
      int mid = dataLength / 2;
      int rem = dataLength - mid;
      int[] leftA = new int[mid];
      int[] rightA = new int[mid];
      System.arraycopy(data, 0, leftA, 0, mid);
      System.arraycopy(data, mid, rightA, 0, rem);
      leftA = this.myMergeSort(leftA);
      rightA = this.myMergeSort(rightA);
      merged = merge(leftA, rightA);
      return merged;
    }
  }

  // public int[] myMerge(int[] L, int[] R) {
  // int[] merged = new int[L.length + R.length];
  //
  // while(L.length > 0 || R.length > 0){
  // if(L.length > 0 && R.length > 0){
  // if(L[0] > R[0]){
  // merged[0] = L[0];
  //
  // }
  //
  // }
  // }
  //
  // return merged;
  // }

  public static int[] sort(int[] intArray) {
    for (int i = 1; i < intArray.length; i++) {
      for (int j = 0; j < i - intArray.length; j++) {
        if (intArray[i] < intArray[j]) {
          int temp = intArray[i];
          intArray[i] = intArray[j];
          intArray[j] = temp;
        }
      }
    }
    return intArray;
  }

  public int[] selectionSort(int[] data) {
    int lenD = data.length;
    int j = 0;
    int tmp = 0;
    for (int i = 0; i < lenD; i++) {
      j = i;
      for (int k = i; k < lenD; k++) {
        if (data[j] > data[k]) {
          j = k;
        }
      }
      tmp = data[i];
      data[i] = data[j];
      data[j] = tmp;
    }
    return data;
  }

  public int[] InsertionSort(int[] data) {
    int len = data.length;
    int key = 0;
    int i = 0;
    for (int j = 1; j < len; j++) {
      key = data[j];
      i = j - 1;
      while (i >= 0 && data[i] > key) {
        data[i + 1] = data[i];
        i = i - 1;
        data[i + 1] = key;
      }
    }
    return data;
  }

  public int[] bubbleSort(int[] data) {
    int lenD = data.length;
    int tmp = 0;
    for (int i = 0; i < lenD; i++) {
      for (int j = (lenD - 1); j >= (i + 1); j--) {
        if (data[j] < data[j - 1]) {
          tmp = data[j];
          data[j] = data[j - 1];
          data[j - 1] = tmp;
        }
      }
    }
    return data;
  }

  public int[] quickSort(int[] data) {
    int lenD = data.length;
    int pivot = 0;
    int ind = lenD / 2;
    int i, j = 0, k = 0;
    if (lenD < 2) {
      return data;
    } else {
      int[] L = new int[lenD];
      int[] R = new int[lenD];
      int[] sorted = new int[lenD];
      pivot = data[ind];
      for (i = 0; i < lenD; i++) {
        if (i != ind) {
          if (data[i] < pivot) {
            L[j] = data[i];
            j++;
          } else {
            R[k] = data[i];
            k++;
          }
        }
      }
      int[] sortedL = new int[j];
      int[] sortedR = new int[k];
      System.arraycopy(L, 0, sortedL, 0, j);
      System.arraycopy(R, 0, sortedR, 0, k);
      sortedL = quickSort(sortedL);
      sortedR = quickSort(sortedR);
      System.arraycopy(sortedL, 0, sorted, 0, j);
      sorted[j] = pivot;
      System.arraycopy(sortedR, 0, sorted, j + 1, k);
      return sorted;
    }
  }

  public int[] mergeSort(int[] data) {
    int lenD = data.length;
    if (lenD <= 1) {
      return data;
    } else {
      int[] sorted = new int[lenD];
      int middle = lenD / 2;
      int rem = lenD - middle;
      int[] L = new int[middle];
      int[] R = new int[rem];
      System.arraycopy(data, 0, L, 0, middle);
      System.arraycopy(data, middle, R, 0, rem);
      L = this.mergeSort(L);
      R = this.mergeSort(R);
      sorted = merge(L, R);
      return sorted;
    }
  }

  public int[] merge(int[] L, int[] R) {

    int lenL = L.length;
    int lenR = R.length;
    int[] merged = new int[lenL + lenR];
    int i = 0;
    int j = 0;
    while (i < lenL || j < lenR) {
      if (i < lenL & j < lenR) {
        if (L[i] <= R[j]) {
          merged[i + j] = L[i];
          i++;
        } else {
          merged[i + j] = R[j];
          j++;
        }
      } else if (i < lenL) {
        merged[i + j] = L[i];
        i++;
      } else if (j < lenR) {
        merged[i + j] = R[j];
        j++;
      }
    }
    return merged;
  }

  public int[] shellSort(int[] data) {
    int lenD = data.length;
    int inc = lenD / 2;
    while (inc > 0) {
      for (int i = inc; i < lenD; i++) {
        int tmp = data[i];
        int j = i;
        while (j >= inc && data[j - inc] > tmp) {
          data[j] = data[j - inc];
          j = j - inc;
        }
        data[j] = tmp;
      }
      inc = (inc / 2);
    }
    return data;
  }

  public static void main(String[] args) {
    int[] intArray1 = { 21, 22, 45, 55, 56, 78, 58, 69, 100 };
    intArray1 = sort(intArray1);
    for (int i : intArray1) {
      System.out.println(i);
    }
  }
}
