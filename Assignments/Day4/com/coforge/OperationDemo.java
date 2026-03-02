package com.coforge;
import java.util.Arrays;
public class OperationDemo
{
	public static void main(String[] args)
	{
		int[] arr = {9, 3, 7, 1, 8};
        System.out.println("Original: " + Arrays.toString(arr));
 
        int sum = sum(arr);
        System.out.println("Sum: " + sum);
 
        int key = 7;
        int idxLinear = linearSearch(arr, key);
        System.out.println("Linear search for " + key + ": index=" + idxLinear);
 
        int[] arrForBinary = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrForBinary);
        int idxBinary = binarySearch(arrForBinary, key);
        System.out.println("Binary search for " + key + " in " + Arrays.toString(arrForBinary) + ": index=" + idxBinary);
 
        int[] a1 = Arrays.copyOf(arr, arr.length);
        bubbleSort(a1);
        System.out.println("Bubble sort:     " + Arrays.toString(a1));
 
        int[] a2 = Arrays.copyOf(arr, arr.length);
        insertionSort(a2);
        System.out.println("Insertion sort:  " + Arrays.toString(a2));
 
        int[] a3 = Arrays.copyOf(arr, arr.length);
        selectionSort(a3);
        System.out.println("Selection sort:  " + Arrays.toString(a3));
 
        int[] a4 = Arrays.copyOf(arr, arr.length);
        quickSort(a4);
        System.out.println("Quicksort:       " + Arrays.toString(a4));
 
        int[] a5 = Arrays.copyOf(arr, arr.length);
        mergeSort(a5);
        System.out.println("Merge sort:      " + Arrays.toString(a5));
 
        int[] afterInsert = insertAt(arr, 2, 99);
        System.out.println("Insert 99 at index 2: " + Arrays.toString(afterInsert));
 
        int[] afterDelete = deleteAt(arr, 3);
        System.out.println("Delete index 3: " + Arrays.toString(afterDelete));
 
        int[] fixedLength = {10, 20, 30, 40, 50};
        System.out.println("Fixed-length(5): " + Arrays.toString(fixedLength));
        
        int[] after6th = safeAppend(fixedLength, 60);
        System.out.println("After appending 6th element safely: " + Arrays.toString(after6th));
	}
	public static int sum(int[] arr)
    {
        int s = 0;
        for (int v : arr) s += v;
        return s;
    }
 
    public static int linearSearch(int[] arr, int key)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == key) return i;
        }
        return -1;
    }
 
    public static int binarySearch(int[] sorted, int key)
    {
        int low = 0, high = sorted.length - 1;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (sorted[mid] == key) return mid;
            if (sorted[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
 
    public static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        boolean swapped;
        for (int pass = 0; pass < n - 1; pass++)
        {
            swapped = false;
            for (int i = 0; i < n - 1 - pass; i++)
            {
                if (arr[i] > arr[i + 1])
                {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
 
    public static void insertionSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
 
    public static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            if (minIdx != i) swap(arr, i, minIdx);
        }
    }
 
    public static void quickSort(int[] arr)
    {
        quickSort(arr, 0, arr.length - 1);
    }
 
    private static void quickSort(int[] a, int low, int high)
    {
        if (low >= high) return;
        int p = partition(a, low, high);
        quickSort(a, low, p - 1);
        quickSort(a, p + 1, high);
    }
 
    private static int partition(int[] a, int low, int high)
    {
        int pivot = a[high];
        int i = low;
        for (int j = low; j < high; j++)
        {
            if (a[j] <= pivot)
            {
                swap(a, i, j);
                i++;
            }
        }
        swap(a, i, high);
        return i;
    }
 
    public static void mergeSort(int[] arr)
    {
        if (arr.length <= 1) return;
        int[] aux = new int[arr.length];
        mergeSort(arr, aux, 0, arr.length - 1);
    }
 
    private static void mergeSort(int[] a, int[] aux, int low, int high)
    {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort(a, aux, low, mid);
        mergeSort(a, aux, mid + 1, high);
        merge(a, aux, low, mid, high);
    }
 
    private static void merge(int[] a, int[] aux, int low, int mid, int high) {
        System.arraycopy(a, low, aux, low, high - low + 1);
        int i = low, j = mid + 1, k = low;
        while (i <= mid && j <= high)
        {
            if (aux[i] <= aux[j]) a[k++] = aux[i++];
            else a[k++] = aux[j++];
        }
        while (i <= mid) a[k++] = aux[i++];
        while (j <= high) a[k++] = aux[j++];
    }
 
    public static int[] insertAt(int[] arr, int index, int value)
    {
        if (index < 0 || index > arr.length)
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + arr.length);
        }
        int[] res = new int[arr.length + 1];
        System.arraycopy(arr, 0, res, 0, index);
        res[index] = value;
        System.arraycopy(arr, index, res, index + 1, arr.length - index);
        return res;
    }
 
    public static int[] deleteAt(int[] arr, int index)
    {
        if (index < 0 || index >= arr.length)
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + arr.length);
        }
        int[] res = new int[arr.length - 1];
        System.arraycopy(arr, 0, res, 0, index);
        System.arraycopy(arr, index + 1, res, index, arr.length - index - 1);
        return res;
    }
 
    public static int[] safeAppend(int[] arr, int value)
    {
        int[] res = Arrays.copyOf(arr, arr.length + 1);
        res[res.length - 1] = value;
        return res;
    }
 
    private static void swap(int[] a, int i, int j)
    {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}