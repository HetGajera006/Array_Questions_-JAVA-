public class removingDuplicates {
    
    // Given a sorted array of integers nums, remove the duplicates in-place such that each unique element appears only once.
    // The order of the elements should be maintained. You must do this using O(1) extra memory, meaning the input array
    // itself should be modified to store the result. Return the new length of the array after removing the duplicates.

    public int removeDuplicates(int array[]){
        int n = array.length;
        int i =0;
        int j=i+1;
        while (j<n) {
            if(array[i] == array[j]){
                j++;
            }
            // when not matched then..
            else{
                i++;
                array[i] = array[j];
                j++;
            }
        }
        return i+1;

    }
    public static void main(String[] args) {
        removingDuplicates remove = new removingDuplicates();

        int arr[] = {1,2,2,2,2,3,3,4};
        int ans = remove.removeDuplicates(arr);
        System.out.println(ans);
    }
}
