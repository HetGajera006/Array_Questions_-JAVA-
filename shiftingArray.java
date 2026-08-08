public class shiftingArray {
    // O(k*n)
    // static void shiftByOne(int array[]){
    //     int n =array.length;
    //     int temp = array[n-1];
    //     for(int i=n-1;i>0;i--){
    //         array[i] = array[i-1];
    //     }
    //     array[0] = temp;

    //     // for(int num : array){
    //     //     System.out.print(num+" ");
    //     // }
    // }

    // static void shiftByk(int array[] , int k){
    //     k = k % array.length;
    //     if(k < 0){
    //         k += array.length;
    //     }

    //     for(int i = 1; i<=k ; i++){
    //         shiftByOne(array);
    //     }

    //     for(int num : array){
    //         System.out.print(num+" ");
    //     }
    // }


    // Optimized version of code -> Time comlexity... O(n)
    static void shiftArrayByk(int array[] , int start , int end){
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    static void rotate(int array[], int k){
        int n = array.length;
        k = k % n;

        if(k < 0){
            k = k + n;
        }

        shiftArrayByk(array,0,k-1);
        shiftArrayByk(array,k,n-1);
        shiftArrayByk(array,0,n-1);

        for(int num : array){
            System.out.print(num+" ");
        }
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        // shiftByk(arr, 2);

        rotate(arr,3);

    }
}
