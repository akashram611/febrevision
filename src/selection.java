public class selection {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={64,25,12,22,11};
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }

            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
        printarr(arr);
    }
}
