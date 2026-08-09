public class TwoSum {

    // This method works only when given(My) array is sorted...
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;

        int array[] = new int[2];

        while (i < j) {

            if (nums[i] + nums[j] == target) {
                array[0] = nums[i];
                array[1] = nums[j];
                return array;
            }

            if (nums[i] + nums[j] > target) {
                j--;
            }

            if (nums[i] + nums[j] < target) {
                i++;
            }
        }

        return array;
    }



    // This works for both Sorted or Unsorted Array...
    // brute force method to find..
    
    public int[] twoSumBruteForce(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }







    public static void main(String[] args) {

        TwoSum sum = new TwoSum();

        int a[] = {2, 7, 11, 15};

        int ans[] = sum.twoSum(a, 9);

        for (int k : ans) {
            System.out.print(k + " ");
        }

        System.out.print("Brute Force Method Output(Indexes of elements) :- ");

        int num[] = sum.twoSumBruteForce(ans, 9);
        for (int k : num) {
            System.out.print(" "+k + " ");
        }
    }
}