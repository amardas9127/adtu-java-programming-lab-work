import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int isPrimeCnt = 0;

        for(int i = 1; i<number;i++){
            if(number%i==0){
                isPrimeCnt++;
            }
        }

        if(isPrimeCnt==1){
            System.out.println(number+" Is prime");
        }
        else{
            System.out.println(number +" Is not prime");
        }
    }
}
