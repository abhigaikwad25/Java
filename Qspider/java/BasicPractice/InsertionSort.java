import java.util.*;
//Optoimal code 1 iteration on every pass


class InsertionSort{
    public static void main(String[] args){
        int[] arr={2,6,1,8,2,3,7};

        System.out.println(Arrays.toString(arr));

        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}