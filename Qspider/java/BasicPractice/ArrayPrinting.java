import java.util.Arrays;
import java.util.Scanner;


// // Array input Using for loop
// class ArrayPrinting{
//     public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//         int[] arr=new int[5];
        

//         System.out.println(Arrays.toString(arr));

//         for(int i=0;i<arr.length;i++){
//             System.out.print("Enter "+ i+1 +" element of array : ");
//             arr[i]=sc.nextInt();
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }












// //Array input Using while loop

// class ArrayPrinting{
//     public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//         int[] arr=new int[5];
        

//         System.out.println(Arrays.toString(arr));

//         int i=0;
//         while(i<arr.length){
//             System.out.print("Enter "+ i+1 +" element of array : ");
//             arr[i]=sc.nextInt();
//             i++;
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }













//Array input Using do while loop

// class ArrayPrinting{
//     public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//         int[] arr=new int[5];
        

//         System.out.println(Arrays.toString(arr));

//         int i=0;
//         do{
//             System.out.print("Enter "+ i+1 +" element of array : ");
//             arr[i]=sc.nextInt();
//             i++;
//         }while(i<arr.length);

//         System.out.println(Arrays.toString(arr));
//     }
// }













//insert random element in array


// class ArrayPrinting{
//     public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//         int[] arr=new int[500];
        
//         System.out.println(Arrays.toString(arr));

//         for(int i=0;i<arr.length;i++){
//             int ele=(int)(Math.random()*999);

//             arr[i]=ele;
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }














//insert all char from A to z without repetition  

// class ArrayPrinting{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         char[] arr=new char[26];
        
//         // System.out.println(Arrays.toString(arr));

//         for(int i=0;i<arr.length;){
//             char ch=(char)(Math.random()*99);
//             if(ch>=65 && ch<=90){
//                 if(!checkRepeat(arr,ch)){
//                     arr[i++]=ch;
//                 }
//             }
//         }

//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));

//     }

//     public static boolean checkRepeat(char[] arr,int ch){
//         for(char ele : arr){
//             if(ele==ch)
//                 return true;
//         }
//         return false;
//     } 
// }














//Reverse element in array 

// class ArrayPrinting{
//     public static void main(String[] args){
//         int[] arr={256,879,356,475,812};

//         for(int i=0;i<arr.length;i++){
//             int rev=0;
//             int ele=arr[i];
//             while(ele>0){
//                 int rem=ele%10;
//                 rev=rev*10+rem;
//                 ele=ele/10;
//             }
//             arr[i]=rev;
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }











// //Armstrong number 

// class ArrayPrinting{
//     public static void main(String[] args){
//         int[] arr={2,153,879,1634,5,7,812,54748};
//         for(int i=0;i<arr.length;i++){
            
//             int eleLen=countLength(arr[i]);
//             if(arr[i]==countArm(arr[i],eleLen)){
//                 System.out.print(arr[i]+ " ");
//             }
//         }
//     }

//     public static int countArm(int arrEle,int eleLen){
//         int sum=0;
//         while(arrEle>0){
//             int digit=arrEle%10;
//             sum+=Math.pow(digit,eleLen);
//             arrEle=arrEle/10;
//         }
//         return sum;
//     }

//     public static int countLength(int arrEle){
//         int count=0;
//         while(arrEle>0){
//             count++;
//             arrEle=arrEle/10;
//         }
//         return count; 
//     }
// }














// Write a java program to convert all the ele to even or odd based on frequency of even or odd element of even elements are more convert all ele to even or vise versa If even and odd ele count is same convert all the ele into even or odd based on first ele

// class ArrayPrinting{
//     public static void main(String[] args){
//         int[] arr={2,1,8,3,4,7};

//         int even=checkEven(arr);
//         int odd=arr.length-even;

//         System.out.println("Array Before operation " + Arrays.toString(arr));
//         System.out.println("Even count : "+ even);
//         System.out.println("Odd count : "+ odd);
        
//         changeValue(arr,even,odd);

//         System.out.println("Array After operation " + Arrays.toString(arr));
//     }

//     public static int checkEven(int[] arr){
//         int count=0;
//         for(int ele : arr){
//             if(ele%2==0){
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static void changeValue(int[] arr,int even,int odd){
//         if(even>odd){
//             System.out.println("!........ All Even .......!");
//             for(int i=0;i<arr.length;i++){
//                 if(arr[i]%2!=0){
//                     arr[i]+=1;
//                 }
//             }
//         }
//         else if(odd>even){
//             System.out.println("!........ All Odd .......!");
//             for(int i=0;i<arr.length;i++){
//                 if(arr[i]%2==0){
//                     arr[i]+=1;
//                 }
//             }
//         }
//         else{

//             if(arr[0]%2==0){
//                 System.out.println("!........ All Even .......!");
//                 for(int i=1;i<arr.length;i++){
//                     if(arr[i]%2!=0){
//                         arr[i]+=1;
//                     }
//                 }
//             }
//             else if(arr[0]%2!=0){
//                 System.out.println("!........ All Odd .......!");
//                 for(int i=1;i<arr.length;i++){
//                     if(arr[i]%2==0){
//                         arr[i]+=1;
//                     }
//                 }
//             }
//         }
//     }
// }













// //merge element of 2D array in single arrays

// class ArrayPrinting{
//     public static void main(String[] args){
//         int[][] arr2d={{1,2,3},{4,5,6}};
        
//         int len=0;
//         for(int[] arr : arr2d){
//             for(int i=0;i<arr.length;i++){
//                 len++;
//             }
//         }

//         int[] resArr=new int[len];
        
//         System.out.println(Arrays.deepToString(arr2d));

//         int indx=0;
//         for(int[] arr : arr2d){
//             for(int i=0;i<arr.length;i++){
//                 resArr[indx++]=arr[i];
//             }
//         }
        
//         System.out.println(Arrays.toString(resArr));
//     }
// }












// //merge element of 2 array in single arrays

// class ArrayPrinting{
//     public static void main(String[] args){
//         int[] arr1={1,2,3,4};
//         int[] arr2={5,6,7};
        
//         int[] resArr=new int[arr1.length+arr2.length];

//         System.out.println(Arrays.toString(arr1));
//         System.out.println(Arrays.toString(arr2));

//         int indx=0;
//         for(int i=0;i<arr1.length;i++){
//             resArr[indx++]=arr1[i];
//             if(i==arr1.length-1){
//                 for(int j=0;j<arr2.length;j++){
//                     resArr[indx++]=arr2[j];
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(resArr));
//     }
// }












// //Separate even and odd element
// //[2,1,3,4,8,7] -> [1, 3, 5, 4, 2, 6]

// class ArrayPrinting{
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5,6};

//         System.out.println(Arrays.toString(arr));

//         for(int i=0;i<arr.length;i++){
//             if(arr[i]%2==0){
//                 for(int j=i+1;j<arr.length;j++){
//                     if(arr[j]%2!=0){
//                         for(int k=j;k>i;k--){
//                             int temp=arr[k-1];
//                             arr[k-1]=arr[k];
//                             arr[k]=temp;
//                         }
//                         break;
//                     }
//                 }
//             }
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }












// //separate number and zeros both end 
//[2,0,1,0,4,3] -> [2,1,4,3,0,0]


// class ArrayPrinting{
//     public static void main(String[] args){
//         int[] arr={2,0,1,0,4,3};

//         System.out.println(Arrays.toString(arr));

//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==0){
//                 for(int j=i+1;j<arr.length;j++){
//                     if(arr[j]!=0){
//                         int temp=arr[i];
//                         arr[i]=arr[j];
//                         arr[j]=temp;
//                         break;
//                     }
//                 }
//             }
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }












// //Separate +ve and -ve element

// class ArrayPrinting{
//     public static void main(String[] args){
//         int[] arr={-1,2,-3,4,5,-6};

//         System.out.println(Arrays.toString(arr));

//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>0){
//                 for(int j=i+1;j<arr.length;j++){
//                     if(arr[j]<0){
//                         for(int k=j;k>i;k--){
//                             int temp=arr[k-1];
//                             arr[k-1]=arr[k];
//                             arr[k]=temp;
//                         }
//                         break;
//                     }
//                 }
//             }
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }

// //Output : [-1, -6, -3, 4, 5, 2] 












//Find factorial of each element and store in same array index

// class ArrayPrinting{
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5,6,7};
//         System.out.println(Arrays.toString(arr));

//         for(int i=0;i<arr.length;i++){
//             int fact=1;
//             for(int j=arr[i];j>0;j--){
//                 fact*=j;
//             }
//             arr[i]=fact;
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }












// //swap numbers in array
// // [1,2,3,4,5,6]

// class ArrayPrinting{
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5,6,7};
//         System.out.println(Arrays.toString(arr));

//         int i=0;
//         int j=arr.length-1;

//         while(i<j){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//             i++;
//             j--;
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }











//Zig Zag merging of tqo seperate array

// class ArrayPrinting{
//     public static void main(String[] args){
//         int[] arr1={1,2,3,4,8,9};
//         int[] arr2={5,6,7};
//         int[] resArr=new int[arr1.length+arr2.length];

//         int max=(arr1.length>arr2.length)?arr1.length:arr2.length;
//         int min=(arr1.length>arr2.length)?arr2.length:arr1.length;

//         int indx=0;
//         for(int i=0;i<max;i++){
//             if(min>i){
//                 resArr[indx++]=arr1[i];
//                 resArr[indx++]=arr2[i];
//             }
//             else if(arr1.length==max){
//                 resArr[indx++]=arr1[i];
//             }
//             else if(arr2.length==max){
//                 resArr[indx++]=arr2[i];
//             }
//         }

//         System.out.println(Arrays.toString(arr1));
//         System.out.println(Arrays.toString(arr2));
//         System.out.println(Arrays.toString(resArr));
//     }
// }


// // output :
// [1, 2, 3, 4, 8, 9]
// [5, 6, 7]
// [1, 5, 2, 6, 3, 7, 4, 8, 9]








// ////Sum of array element

// class ArrayPrinting{
//     public static void main(String[] args){
//         int[] arr1={1,2,3,4,8,9};
        
//         System.out.println(Arrays.toString(arr1));

//         int sum=0;
//         for(int ele : arr1){
//             sum+=ele;
//         }

//         System.out.println("Addition : "+sum);
//     }
// }












////Product of array element

// class ArrayPrinting{
//     public static void main(String[] args){
//         int[] arr1={1,2,3};
        
//         System.out.println(Arrays.toString(arr1));

//         int prod=1;
//         for(int ele : arr1){
//             prod*=ele;
//         }

//         System.out.println("product : "+prod);
//     }
// }








//Count frequency

// class ArrayPrinting{
//     public static void main(String[] args){
//         int[] arr={1,2,3,2,1,1,1,6};
//         boolean[] b=new boolean[arr.length];
//         System.out.println(Arrays.toString(arr));

//         for(int i=0;i<arr.length;i++){
//             if(b[i]) continue;
//             int count=0;
//             for(int j=0;j<arr.length;j++){
//                 if(arr[i]==arr[j] && b[j]==false){
//                     count++;
//                     b[j]=true;
//                 }
//             }
//             System.out.println(arr[i]+" : "+count);
//         }
//     }
// }









//display duplicates

// class ArrayPrinting{
//     public static void main(String[] args){
//         int[] arr={1,2,3,2,1,1,1,6};
//         boolean[] b=new boolean[arr.length];
//         System.out.println(Arrays.toString(arr));

//         for(int i=0;i<arr.length;i++){
//             if(b[i]) continue;
//             int count=0;
//             for(int j=0;j<arr.length;j++){
//                 if(arr[i]==arr[j] && b[j]==false){
//                     count++;
//                     b[j]=true;
//                 }
//             }
//             if(count>1)
//                 System.out.println(arr[i]);
//         }
//     }
// }
















//

class ArrayPrinting{
    public static void main(String[] args){
        int[] arr={1,2,3,2,1,1,1,6};
        boolean[] b=new boolean[arr.length];
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            if(b[i]) continue;
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && b[j]==false){
                    count++;
                    b[j]=true;
                }
            }
            if(count>1)
                System.out.println(arr[i]);
        }
    }
}






