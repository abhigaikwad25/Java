// 1) find frequency of element in an array
// 2) find distinct element in an array
// 3) find unique elements in array(count is 1)
// 4) find the duplicate (repeating elements in an array)
// 5) find the first largest element (unsorted array)
// 6) find the smallest element in an array
// 7) find least repeating element in an array
// 8) find 2nd largest element in array
// 9) find  2nd smallest in an array
// 10) find the second largest repeating and 2nd smallest element


// 1) find frequency of element in an array

// class ArrayExDay3{
//     public static void main(String[] args){
//         int[] arr={1,2,1,3,4,2,5,6};
//         boolean[] b=new boolean[arr.length];
        
//         for(int i=0;i<arr.length;i++){
//             if(b[i]==true) continue;
//             int count=0;
//             for(int j=0;j<arr.length;j++){
//                 if(arr[i]==arr[j] && b[j]==false){
//                     b[j]=true;
//                     count++;
//                 }
//             }
//             System.out.println(arr[i]+" : "+count);
//         }
//     }
// }











// 2) find distinct element in an array

// class ArrayExDay3{
//     public static void main(String[] args){
//         int[] arr={1,2,1,3,4,2,5,6};
//         boolean[] b=new boolean[arr.length];
        
//         for(int i=0;i<arr.length;i++){
//             if(b[i]==true) continue;
//             int count=0;
//             for(int j=0;j<arr.length;j++){
//                 if(arr[i]==arr[j] && b[j]==false){
//                     b[j]=true;
//                     count++;
//                 }
//             }
//             if(count==1){
//                 System.out.print(arr[i] + " ");
//             }
//         }
//     }
// }













// 4) find the duplicate (repeating elements in an array)

// class ArrayExDay3{
//     public static void main(String[] args){
//         int[] arr={1,2,1,3,4,2,5,6};
//         boolean[] b=new boolean[arr.length];
        
//         for(int i=0;i<arr.length;i++){
//             if(b[i]==true) continue;
//             int count=0;
//             for(int j=0;j<arr.length;j++){
//                 if(arr[i]==arr[j] && b[j]==false){
//                     b[j]=true;
//                     count++;
//                 }
//             }
//             if(count>1){
//                 System.out.print(arr[i] + " ");
//             }
//         }
//     }
// }












// 6) find the smallest element in an array

// class ArrayExDay3{
//     public static void main(String[] args){
//         int[] arr={-11111,2,1,3,4,2,5,6};
//         boolean[] b=new boolean[arr.length];
        
//         int min=Integer.MAX_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<min){
//                 min=arr[i];
//             }
//         }
//         System.out.println("Mininmum element : "+min);
//     }
// }



























// //clockWise rotation 

// import java.util.Scanner;
// import java.util.*;
// class ArrayExDay3{
//     public static void main(String[] args){
//         int[] arr={2,1,3,4,2,5,6};
//         System.out.print("Enter the number of rotation : ");
//         Scanner sc=new Scanner(System.in);
//         int rot=sc.nextInt();
//         System.out.println("Before : "+Arrays.toString(arr));
//         clockWiseRot(arr,rot);
//         System.out.println("After : "+Arrays.toString(arr));

//     }

//     public static void clockWiseRot(int[] arr,int rot){
//         for(int i=1;i<=rot;i++){
//             int temp=arr[0];
//             for(int j=1;j<arr.length;j++){
//                 arr[j-1]=arr[j];
//             }
//             arr[arr.length-1]=temp;
//         }
//     } 
// }










// // AnticlockWise rotation 
// import java.util.Scanner;
// import java.util.*;
// class ArrayExDay3{
//     public static void main(String[] args){
//         int[] arr={2,1,3,4,2,5,6};
//         System.out.print("Enter the number of rotation : ");
//         Scanner sc=new Scanner(System.in);
//         int rot=sc.nextInt();
//         System.out.println("Before : "+Arrays.toString(arr));
//         clockWiseRot(arr,rot);
//         System.out.println("After  : "+Arrays.toString(arr));

//     }

//     public static void clockWiseRot(int[] arr,int rot){
//         for(int i=1;i<=rot;i++){
//             int temp=arr[arr.length-1];
//             for(int j=arr.length-1;j>0;j--){
//                 arr[j]=arr[j-1];
//             }
//             arr[0]=temp;
//         }
//     } 
// }





// class ArrayExDay3{
//     public static void main(String[] args){
//         int[][] arr={{1,20},{9,19}};
        
//         for(int[] arr1: arr){
//             countRepeat(arr1[0],arr[length-1]);
//         }

//     }

//     public static void countRepeat(int first,int last){
//         int repeat=0;
//         int[] tempArr=new int;
//         for(int i=first;i<=last;i++){
//             int digit=i%10;
//             int 
//             if(digit)
//         }
//     }

    
// }