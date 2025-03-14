public class longsumpos {
    public static int getlong(int arr[], int k){
        int n=arr.length;
        int left=0;
        int right=0;
        long sum=arr[0];
        int maxlen=0;
        while(right<n){
            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxlen=Math.max(maxlen, right-left+1);
            }
            right++;
            if(right<n) sum+=arr[right];
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,1,9};
        int k=10;
        int len=getlong(arr,k);
        System.out.println(len);
    }
}
