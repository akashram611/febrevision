public class move0toend {
    public static int[] movezero(int arr[], int n) {
        int j = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                if(i!=j){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
                j++;
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,0,4,0,5};
        int n=arr.length;
        int ans[]=movezero(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
