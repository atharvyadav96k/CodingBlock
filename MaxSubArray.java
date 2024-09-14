public class MaxSubArray{
    public static void main(String[] args) {
        int[] a = {4, -6, 5, -3, 6, -4, 2};
        int max = -100;
        for(int i=0;i<a.length;i++){
            int sum = 0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}