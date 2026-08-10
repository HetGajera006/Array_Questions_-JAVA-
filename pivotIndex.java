public class pivotIndex {
    
    //The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

    // O(3n) = O(n) Time Complexity..

    public int findPivotIndex1(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        leftSum[0] = nums[0];
        for(int i = 1; i<n ;i++){
            leftSum[i] = nums[i] + leftSum[i-1];
        }

        rightSum[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            rightSum[i] = nums[i] + rightSum[i+1];
        }

        for(int i=0;i<n;i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }
        return -1;
    }


    // O(2n) = O(n) Time Complexity..

    public int findPivotIndex2(int[] nums) {

    int totalSum = 0;
    for (int num : nums) {
        totalSum += num;
    }

    int leftSum = 0;

    for (int i = 0; i < nums.length; i++) {

        totalSum -= nums[i];

        if (leftSum == totalSum) {
            return i;
        }
        leftSum += nums[i];
    }

    return -1;
}

    public static void main(String[] args) {
        pivotIndex index = new pivotIndex();
        int[] nums = {1, 7, 3, 6, 5, 6};

        // 1st Method..
        int result = index.findPivotIndex1(nums);
        System.out.println("Pivot Index: " + result);

        // 2nd Method..
        int result2 = index.findPivotIndex2(nums);
        System.out.println(result2);
    }
}