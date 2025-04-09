import java.util.Arrays;
class binarySearch{
    public static void main(String[] args){
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        int num=40;
        int n=arr.length;
        System.out.println("size : "+n);
        binarySearch obj=new binarySearch();
        int res=obj.search(arr,num,n);
        if(res==-1){
            System.out.println("array element can't find");
        }
        else{
            System.out.println("array element find at location : "+ (res+1));
        }
    }

    int search(int arr[],int num,int n){
        int start=0;
        int end=n-1;

        while(start<=end){
            int mid = start + (end - start) / 2;
            if(arr[mid]==num){
                return mid;
            }
            if(arr[mid]>num){
                end=mid-1;   
            }
            if(arr[mid]<num){
                start=mid+1;
            }
        }
        return -1;
    }
}