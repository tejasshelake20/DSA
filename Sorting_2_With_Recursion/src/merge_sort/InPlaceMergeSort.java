package merge_sort;
import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1,6};
        inplaceMergeSortFunction(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void inplaceMergeSortFunction(int[] arr,int s,int e){
        if(e-s == 1){
            return;
        }

        int mid = (s+e) / 2;

        inplaceMergeSortFunction(arr,s,mid);
        inplaceMergeSortFunction(arr,mid,e);

        mergeInPlace(arr,s,mid,e);

    }

    public static void mergeInPlace(int[] arr, int s, int mid, int e){
        int[] mix = new int[e-s];

        int i = s;
        int j = mid;
        int k = 0;

        while(i < mid && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }

            k++;

        }
        // It might be a case that one of the array is not yet completed to be a part of int[] mix

        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }

    }

}


