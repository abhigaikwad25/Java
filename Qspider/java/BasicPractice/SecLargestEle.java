// 8) find 2nd largest element in array

class SecLargestEle{
    public static void main(String[] args){
        int[] arr={6,1,3,4,2,5};
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }
            if(arr[i]<max && arr[i]>secMax){
                secMax=arr[i];
            }
        }
        System.out.println("Second Maximum element : "+secMax);
    }
}

