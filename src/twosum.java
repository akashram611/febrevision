import java.util.Arrays;

public class twosum {
    public static String twosumans(int[] arr, int target){
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return "Yes";
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        int arr[]={9,2,6,4,5};
        int target=13;
        String ans=twosumans(arr,target);
        System.out.println(ans);
    }
}
