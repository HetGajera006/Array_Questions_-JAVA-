public class maximumSubArray {
    
    static int findMaximumSubArray(int array[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int n = array.length;
        for(int i=0; i<n; i++){
            sum += array[i];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0 ){
                sum = 0;
            }
        }
        return maxSum;
    }


    public static void main(String[] args) {
            int a[] = {-2,1,-3,4,-1,2,1,-5,4};

            int b[] = {5,4,-1,7,8};

        int ans = findMaximumSubArray(a);
        int ans2 = findMaximumSubArray(b);

        System.out.println(ans);
        System.out.println(ans2);
    }
}
