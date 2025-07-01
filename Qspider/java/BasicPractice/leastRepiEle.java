// 7) find first least repeating element in an array


class leastRepiEle{
    public static void main(String[] args){
        int[] arr={1,2,1,2};
        boolean[] b=new boolean[arr.length];
        
        int least=arr.length;
        for(int i=0;i<arr.length;i++){
            if(b[i]==true) continue;
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && b[j]==false){
                    b[j]=true;
                    count++;
                }
            }
            if(count<least){
                System.out.println("Least Repeated Element is "+arr[i]+" : "+count+ " times");
            }
        }
    }
}

