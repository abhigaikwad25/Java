//checking siize of array without using length variable

// class Basic{
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5,6,7,8,9};
//         System.out.println("using length : "+arr.length);
//         int len=0;
//         for(int i=0; true; i++){
//             try{
//                 int a=arr[i];
//             }
//             catch(ArrayIndexOutOfBoundsException e){
//                 break;
//             }
//             len++;
//         }
//         System.out.println("without using length : "+len);
//     }
// }



// class Basic{
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5,6,7,8,9};
//         System.out.println("using length : "+arr.length);
        
//         int len=0;
//         for(int ele : arr){
//             len++;
//         }
//         System.out.println("without using length : "+len);
//     }
// }



//Array element printing using recursion 

// class Basic{
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5,6,7,8,9};
        
//         System.out.println("Array Printing Using Recursion : ");
//         checkLen(arr,0,arr.length);
//     }
//     public static void checkLen(int[] arr,int i,int n){
//         if(i==n) return ;
//         System.out.print(arr[i++]+ " ");
//         checkLen(arr,i,n);
//     }
// }


//Reverse Printning 

// class Basic{
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5,6,7,8,9};
        
//         System.out.println("Reverse Array Printing Using Recursion : ");
//         checkLen(arr,arr.length-1);
//     }
//     public static void checkLen(int[] arr,int n){
//         if(n==0) return ;
//         System.out.print(arr[n]+ " ");
//         checkLen(arr,--n);
//     }
// }



//Printing array using for,while and do while

// class Basic{
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5,6,7,8,9};
        
//         System.out.print("Using For loop : ");
//         System.out.print("{");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println("}");




//         System.out.print("Using While loop : ");
//         int i=0;
//         System.out.print("{");
//         while(i<arr.length){
//             System.out.print(arr[i]+" ");
//             i++;
//         }
//         System.out.println("}");




//         System.out.print("Using Do While loop : ");
//         int j=0;
//         System.out.print("{");
//         do{
//             System.out.print(arr[j]+" ");
//             j++;
//         }while(j<arr.length);
//         System.out.println("}");

//     }
// }



//Second largest number in array
// import java.util.Arrays;
// class Basic{
//     public static void main(String[] args){
//         int[] arr={4,5,7,1,2,6,3,8,9};
        
//         Arrays.sort(arr);
//         for(int i=arr.length-1;i>=0;i--){
//             System.out.print(arr[i]+" ");
//         }

//         System.out.println();
//         System.out.println("Second Largest number : " +arr[arr.length-2]);
//     }
    
// }




//remove duplicates
// import java.util.ArrayList;
// class Basic{
//     public static void main(String[] args){
//         int[] arr={4,5,5,1,2,6,3,5,4};
        
//         ArrayList<Integer> newArr=new ArrayList<>();
        
//         for(int ele : arr){
//             newArr.add(ele);
//         }
        
//         System.out.println(newArr);

//         for(int i=0;i<newArr.size();i++){
//             for(int j=i+1;j<newArr.size();j++){
//                 if(newArr.get(i)==newArr.get(j)){
//                     newArr.remove(j);
//                 }
//             }
//         }

//         System.out.println(newArr);
//     }
    
// }




//check array is sorted 

// import java.util.ArrayList;
// class Basic{
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5};

//         Outerloop:
//         for(int i=0;i<arr.length;i++){
//             Innerloop:
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]>arr[j]){
//                     System.out.println("Array is not Sorted");
//                     break Outerloop;
//                 }
//             }
//             if(i==arr.length-1){
//                 System.out.println("Array is Sorted");
//             }
//         }
//     }
    
// }


//alternate element rotate

// class Basic{
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5,6};

//         int i=0;
//         int j=1;
//         while(i<arr.length-1 && j<arr.length){
//             int temp=arr[j];
//             arr[j]=arr[i];
//             arr[i]=temp;
//             i=i+2;
//             j=j+2;
//         }

//         for(int ele : arr){
//             System.out.println(ele+ " ");
//         }
//     } 
// }


//Left Rotate an Array by 1
// import java.util.Arrays;
// class Basic{
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5,6};

//         int first=arr[0];
//         int i=1;
//         while(i<arr.length){
//             arr[i-1]=arr[i];
//             i++;
//         }

//         arr[arr.length-1]=first;

//         System.out.println(Arrays.toString(arr));
//     } 
// }







//Array declarartion inside constructor
import java.util.Arrays;
class Basic{
    
    Basic(){
        int[] arr=new int[4];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;

        System.out.println(Arrays.toString(arr));
    }

    

    public static void main(String[] args){
        Basic obj=new Basic();
        System.out.println("Code run succesfully");
    } 
}




