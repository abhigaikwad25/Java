// class Pattern{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=(5-i);j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }




// class Pattern{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// * 
// * *
// * * *
// * * * *
// * * * * *



// class Pattern{
//     public static void main(String[] args){
//         for(int i=5;i>=1;i--){
//             for(int j=1;j<=(5-i);j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// output : 
// * * * * * 
//   * * * * 
//     * * * 
//       * * 
//         * 



// class Pattern{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=(5-i);j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }




// class Pattern{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=(5-i);j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             for(int j=2;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
// output:
//         * 
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *




// class Pattern{
//     public static void main(String[] args){
//         // for(int i=1;i<=5;i++){
//         //     for(int j=1;j<=(5-i);j++){
//         //         System.out.print("  ");
//         //     }
//         //     for(int j=1;j<=i;j++){
//         //         System.out.print("* ");
//         //     }
//         //     for(int j=2;j<=i;j++){
//         //         System.out.print("* ");
//         //     }
//         //     System.out.println();
//         // }
//         for(int i=5;i>=1;i--){
//             for(int j=1;j<=(5-i);j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             for(int j=2;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }





// class Pattern{
//     public static void main(String[] args){
//         int num=1;
//         for(int i=1;i<=5;i++){
//             for(int j=5;j>=1;j--){
//                 if(j<=i){
//                     System.out.print(num++ +"  ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }





// public class Pattern {
//     public static void main(String[] args) {
//         int num = 1;

//         for (int i = 1; i <= 5; i++) {
//             int start = num + i - 1; // last number in the current row

//             // Print numbers in reverse for the current row
//             for (int j = start; j >= num; j--) {
//                 System.out.print(j + " ");
//             }

//             System.out.println();
//             num = start + 1; // update starting number for next row
//         }
//     }
// }






public class Pattern {
    public static void main(String[] args) {
        int num = 1;

        for (int i = 1; i <= 5; i++) {
            for(int j=1;j<)
            System.out.println((5-i)+2+(i-1));
        }
    }
}

//    1 2  3  4  5
// 1//1
// 2//2 6
// 3//3 7 10
// 4//4 8 11 13
// 5//5 9 12 14 15






