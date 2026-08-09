import java.util.HashMap;

public class firstRepeatingElement {
    // Given an array arr[], find the first repeating element index. The element should occur more than once and the index of its first occurrence should be the smallest.
    //Note:- The position you return should be according to 1-based indexing.

    public int firstRepeated(int array[]){

        HashMap<Integer,Integer> freqMap = new HashMap<>();

        for(int i : array){
            freqMap.put(i, freqMap.getOrDefault(i, 0)+1);
        }

        for(int k =0; k<array.length;k++){
            if(freqMap.get(array[k]) > 1){
                return k+1; // for element index...
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        firstRepeatingElement f = new firstRepeatingElement();
        int array[] = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(f.firstRepeated(array));
    }
}
