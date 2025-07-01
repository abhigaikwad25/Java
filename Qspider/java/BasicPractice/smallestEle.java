// //// 6) find the smallest element in an array

class ArrayExDay3{
    public static void main(String[] args){
        int[] arr={2,1,3,4,2,5,6};
        boolean[] b=new boolean[arr.length];
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Mininmum element : "+min);
    }
}