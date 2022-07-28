import java.util.PriorityQueue;

public class KthLargestElementArray {
    //use minimum heap, so that you can delete the smaller elements until k
    //and then return the first element which will be the smallest among the remaining k elements

    static int kthLargestElementArray(int [] arr, int k){
        //min heap
        PriorityQueue<Integer> ans = new PriorityQueue<>();

        //addition in min heap
        for(int i= 0; i<arr.length; i++){
            ans.add(arr[i]);
        }
        //keep only k elements
        while(ans.size()>k){
            ans.poll();
        }//then return first one, which will be kth largest in array, meanwhile, smallest in k elements
        return ans.peek();
    }



    public static void main(String[] args) {

    }
}
