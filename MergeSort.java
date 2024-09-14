public class MergeSort {
    public static void main(String[] args) {
        int[] a1 = {1, 5, 10, 15};
        int[] a2 = {2, 4};
        int[] a3 = new int[a1.length + a2.length];
        int i = 0;
        int j = 0;
        int idx = 0;
        while(i < a1.length && j < a2.length){
            if (a1[i] > a2[j]) {
                a3[idx] = a2[j];
                j++;
                idx++;
            } else{
                a3[idx] = a1[i];
                i++;
                idx++;
            }
        }
        while(j < a2.length){
            a3[idx] = a2[j];
            j++;
            idx++;
        }
        while(i < a1.length){
            a3[idx] = a1[i];
            i++;
            idx++;
        }
        for(int k=0;k < a1.length + a2.length;k++){
            System.out.println(a3[k]);
        }
    }
}
