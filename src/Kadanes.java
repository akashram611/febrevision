public class Kadanes {
    public static int maxsum(int arr[]){
        int maxadd=arr[0];
        int currsum=arr[0];
        for(int i=1;i<arr.length;i++){
            currsum=Math.max(arr[i],currsum+arr[i]);
            maxadd=Math.max(maxadd,currsum);
        }
        return maxadd;
    }

    public static void main(String[] args) {
        int arr[]={-3,-2,-1,1,4,6,-5};
        int ans=maxsum(arr);
        System.out.println(ans);
    }
}
