import java.util.HashMap;

public class subArray{

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> map =  new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int output = 0;

        for(int array : nums){
            sum += array;

            if(map.containsKey(sum - k)){
                output += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return output;
    }


    public static void main(String[] args) {
        subArray sa = new subArray();
        int array[] = {1,1,1};
        int ans = sa.subarraySum(array, 2);
        System.out.println(ans);
    }
}
