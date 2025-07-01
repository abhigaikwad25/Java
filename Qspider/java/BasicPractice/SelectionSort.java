import java.util.*;
//Optoimal code 1 iteration on every pass


class SelectionSort{
    public static void main(String[] args){
        int[] arr={2,6,3,8,2,1,7};

        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            int minIdx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIdx]>arr[j]){
                    minIdx=j;
                }
            }
            if(minIdx != i){
                int temp=arr[i];
                arr[i]=arr[minIdx];
                arr[minIdx]=temp;
            }
            System.out.println(Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(arr));
    }
}