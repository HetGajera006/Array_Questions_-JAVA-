import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class ThreeSum {

    // Brute Force Method to solve..

    public List<List<Integer>> threesum(int nums[]){
        
        Set<List<Integer>> output = new HashSet<>();


        int n=nums.length;
        int target = 0;

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k] == target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        output.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(output);
    }

    // Two pointers method...
    // first fix one number from first index than use two pointer method to sum all three values..
    
    public List<List<Integer>> threesumTwoPointer(int nums[]){

        int n=nums.length;
        int target =0;

        Set<List<Integer>> output = new HashSet<>();


        for(int i=0;i<n;i++){
            int firstPointer = i+1;
            int secPointer = n-1;

            while(firstPointer <= secPointer){
                int sum = nums[i]+nums[firstPointer]+nums[secPointer];

                if(sum==target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[firstPointer]);
                    list.add(nums[secPointer]);
                    Collections.sort(list);
                    output.add(list);
                    firstPointer++;
                    secPointer--;
                }

                else if(sum < target){
                    secPointer--;
                }

                else{
                    firstPointer++;
                }
            }

        }
        return new ArrayList<>(output);
    }


    public static void main(String[] args) {
        int array[] = {-1,0,1,2,-1,-4};
        ThreeSum Tsum = new ThreeSum();

        // List<List<Integer>> ans = Tsum.threesum(array);
        // System.out.println(ans);

        List<List<Integer>> ans2 = Tsum.threesumTwoPointer(array);
        System.out.println(ans2);

    }
}
