import java.util.PriorityQueue;

public class KthLargestElementArray {
    static int kthLargestElementArray(int [] arr, int k){
        PriorityQueue<Integer> ans = new PriorityQueue<>();
        for(int i= 0; i<arr.length; i++){
            ans.add(arr[i]);
        }
        while(ans.size()>k){
            ans.poll();
        }return ans.peek();
    }



    public static void main(String[] args) {

    }
}
