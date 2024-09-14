
public class Wave2dArray {

    public static void main(String[] args) {
        int[][] a = {{6, 7, 1, 2},
        {8, 2, 8, 9},
        {0, 2, -1, 0},
        {8, 4, 7, 1}};
        for(int i = 0; i < a.length; i++) {
            if(i % 2 == 0){
                for(int j=0;j<a[i].length;j++){
                    System.out.print(a[i][j]+" ");
                }
            }else{
                for(int j=a.length-1;j>=0;j--){
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println("");
        }
    }
}