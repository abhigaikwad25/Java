// // // 9) find  2nd smallest in an array

class SecSmallestEle{
    public static void main(String[] args){
        int[] arr={6,1,3,4,2,5};
        int min=Integer.MAX_VALUE;
        int secMin=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                secMin=min;
                min=arr[i];
            }
            if(arr[i]>min && arr[i]<secMin){
                secMin=arr[i];
            }
        }
        System.out.println("Second Maximum element : "+secMin);
    }
}
