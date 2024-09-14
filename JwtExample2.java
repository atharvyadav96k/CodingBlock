public class JwtExample2 {
    public static void main(String args[]) {
        JwtExample2 j = new JwtExample2();
        for(int i=100;i<=10000;i++){
            if(j.isPal(i)){
                System.out.println("This is pal : " + i);
            }
        }
    }
    private boolean isPal(int number){
        int newNumber = 0;
        int num = number;
        while (number > 0) {
            newNumber = (newNumber * 10) + (number % 10);
            number /= 10;
        }
        return num == newNumber;
    }
}
