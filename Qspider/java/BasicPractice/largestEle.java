// 5) find the largest element (unsorted array)

class largestEle{
    public static void main(String[] args){
        int[] arr={2,5,3,4,2,5};
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element : "+max);
    }
}










