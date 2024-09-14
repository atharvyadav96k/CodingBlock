public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        int[] arr = {2, 3, 4, 5, 6, 7};
        int idx = b.searchBinary(arr, 2);
        System.out.println(idx);
    }
    private int searchBinary(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while(left<=right){  
            int mid = left + (right - left) / 2;
           if(arr[mid] == target){
               return mid;
           }else if(arr[mid] < target){
               left = mid + 1;
           }else{
               right = mid - 1;
           }
       }
       return -1;
    }
}
