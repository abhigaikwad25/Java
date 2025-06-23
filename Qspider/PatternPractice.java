// class PatternPractice{
//     public static void main(String[] args){
//         for(int i=0;i<5;i++){
//             for(int j=0;j<5;j++){
//                 if(j<=i){
//                     System.out.print("*"+" ");
//                 }
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


// class PatternPractice{
//     public static void main(String[] args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(j<=n-i){
//                     System.out.print("  ");
//                 }
//                 else{
//                     System.out.print("*"+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//         * 
//       * *
//     * * *
//   * * * *
// * * * * *


// class PatternPractice{
//     public static void main(String[] args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(j<=n-i+1){
//                     System.out.print("*"+" ");
//                 }
//                 else{
//                     break;
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// * * * * * 
// * * * *
// * * *
// * *
// *



class PatternPractice{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<i){
                    System.out.print("  ");
                }
                else{
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }
}

// * * * * * 
//   * * * *
//     * * *
//       * *
//         *