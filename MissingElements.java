import java.util.ArrayList;
import java.util.List;

public class MissingElements {
    
    public List<Integer> findDisappearedNumbers(int array[]) {
    
        List<Integer> list = new ArrayList<>();
    int n = array.length;
    
    for(int index = 0; index < n; index++){
        int value = Math.abs(array[index]);
        int position = value - 1;

        if(array[position] > 0){
            array[position] = -array[position];
        }
    }
    
    for(int i = 0; i<n ; i++){
        if(array[i] > 0){
            int valueAtIndex = i+1;
            list.add(valueAtIndex);
        }
    }
    return list;
    }




    public static void main(String[] args) {
        int arr[] = {3, 2, 3, 4, 5};

        MissingElements mis = new MissingElements();

        List<Integer> result = mis.findDisappearedNumbers(arr);

        System.out.println(result);
    }
}
