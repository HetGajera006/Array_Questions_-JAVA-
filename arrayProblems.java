import java.util.HashMap;
import java.util.HashSet;

public class arrayProblems {

    // Question 1 :- reverse an array...

    static void reverseAnArray(int array[]){
        int i = 0;
        int j = array.length - 1;

        while(i <= j){
            // swap
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            // i++ and j--
            i++; j--;
        }

        for(int k : array){
            System.out.print(k+" ");
        }
        System.out.println();
    }

    // Question 2 :- shift an element by 1 position...

    static void shiftby1(int array[]){
        int n = array.length;
        int temp = array[n-1];
        for(int i = n-1; i>0; i--){
            array[i] = array[i-1];
        }
        array[0] = temp;

        for(int k : array){
            System.out.print(k+" ");
        }
        System.out.println();
    }

    // Question 3 :- Find the mode of n array
    //Identify element with highest and lowest frequency..

    static int findModeOfArray(int array[]){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num : array){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        // for(int i : freq.keySet()){
        //     System.out.println(i + " -> " + freq.get(i));
        // }

        int maxFreq = -1;
        int maxFreqKey = -1;

        for(int key : freq.keySet()){
            int currentkey = key;
            int currentkeyKiFrequency = freq.get(key);

            if(currentkeyKiFrequency > maxFreq){
                maxFreq = currentkeyKiFrequency;
                maxFreqKey = currentkey;
            }
        }
        return maxFreqKey;
    }

    // Question 4 :- Identify Highest and Lowest element...

    static int[] identifyHighestAndLowest(int array[]){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num : array){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int highestfreq = Integer.MIN_VALUE;
        int highestNum = -1;

        for(int k : freq.keySet()){
            int currentkey = k;
            int currentFreq = freq.get(k);

            if(currentFreq > highestfreq){
                highestfreq = currentFreq;
                highestNum = currentkey;
            }
        }
        
        int lowestfreq = Integer.MAX_VALUE;
        int lowestNum = -1;

        for(int k : freq.keySet()){
            int currentkey = k;
            int currentFreq = freq.get(k);

        if(currentFreq < lowestfreq){
            lowestfreq = currentFreq;
            lowestNum = currentkey;
            }
        }

        int ans[] = {highestNum, lowestNum};
        return ans;
    }

    // Question 5 :- finding intersection of two array...
    static void findIntersection(int array1[] , int array2[]){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i : array1){
            set.add(i);
        }
        for(int j : array2){
            if(set.contains(j)){
                set2.add(j);
            }
        }
        for(int k : set2){
            System.out.print(k + " ");
        }
        System.out.println();
    }

    // Question 6 :- Finding Union Of Arrays...
    static void findingUnionOfArrays(int array1[] , int array2[]){
        HashSet<Integer> unionSet = new HashSet<>();
        for(int i : array1){
            unionSet.add(i);
        }
        for(int j : array2){
            unionSet.add(j);
        }
        for(int k : unionSet){
            System.out.print(k+" ");
        }
        System.out.println();
    }
    

    public static void main(String[] args) {

        // // Quesion 1
        // int a[] = {1,21,1,2,3,4,5,6,7,8,9,1,3,4,5,9,9,9,9,9,9,9};
        // // reverseAnArray(a);

        // // Question 2...
        // // shiftby1(a);

        // // Question 3...
        // int ans = findModeOfArray(a);
        // System.out.println(ans);

        // // Question 4...
        // int arr[] = {1,2,2,3,4,5,6,7,8,9,99,9,9,9,5,5,4,4,3,3,3,5,5,7,7,7,7,7,7,7,8,8,8,8,1};
        // int answer[] = identifyHighestAndLowest(arr);
        // System.out.println("Highest Frequency Number -> " + answer[0]);
        // System.out.println("Lowest  Frequency Number -> " + answer[1]);

        // Question 5...
        int array1[] = {1,2,3,4,5};
        int array2[] = {2,5,6,7,8,3};
        findIntersection(array1, array2);

        // Question 6...
        findingUnionOfArrays(array1, array2);
    }
}
