import java.util.Arrays;

class BubbleSort{
    public static void main(String[] args){
        int[] arr={2,5,1,9,7,3,2};
        System.out.println(Arrays.toString(arr));

        bubble(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr){

        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            System.out.println("Iteration"+ i);
        }

    }
}