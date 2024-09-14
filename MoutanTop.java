
public class MoutanTop {

    public static void main(String[] args) {
        int[] a = {0, 0, 0, 0, 1, 0, 0, 0};
        System.out.print(find(a));
    }
    public static int find(int a[]){
        int left = 0;
        int right = a.length-1;
        while(left<=right){
            int mid = (left + right) / 2;
            if(a[mid] < a[mid+1]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return  right;
    }
}
