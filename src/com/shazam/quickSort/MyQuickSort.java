package com.shazam.quickSort;

public class MyQuickSort {
    public static void getSortArry(int[] arr,int low,int high){
        if(low>high){
            return;
        }
        int t;
        int i = low;
        int j = high;
        int temp = arr[i];



        while(i<j){
            while(temp<=arr[j]&&i<j){
                j--;
            }
            while(temp>=arr[i]&&i<j){
                i++;
            }
            if(i<j){
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }

        arr[low] = arr[i];
        arr[i] = temp;

        getSortArry(arr,low,j-1);
        getSortArry(arr,j+1, high);
    }

    public static void main(String[] args) {
        int[] i = {5,3,2,6,7,9,1};
        getSortArry(i,0,i.length-1);
        for(int ii:i){
            System.out.println(ii);
        }
    }
}
