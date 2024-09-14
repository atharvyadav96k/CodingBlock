
public class ArmStrongNum {
    public static void main(String[] args) {
        ArmStrongNum a = new ArmStrongNum();
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // System.out.println(a.numberOfDigit(n));
        // System.out.println(a.isArmStrong(n, a.numberOfDigit(n)));
        for(int i=10000;i<100000;i++){
            if(a.isArmStrong(i, 5)){
                System.out.println(i);
            }
        }
    }
    private int numberOfDigit(int n){
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        return count;
    }
    private boolean isArmStrong(int n, int power){
        int newNumber = 0;
        int t = n;
        while(t > 0){
            int temp = t % 10;
            newNumber += (int)Math.pow(temp, power);
            t = t / 10;
        }
        return newNumber == n;
    }
}
