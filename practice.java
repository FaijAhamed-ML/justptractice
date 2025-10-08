import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] numbers=new int[5];

        for(int i=0; i<numbers.length;i++){
            int j=i+1;
            System.out.print("input number "+j+": ");
            numbers[i]= input.nextInt();
        }

        System.out.print("\ninital values ");
        for(int i=0; i<numbers.length;i++){
            System.out.print(" "+numbers[i]+" ");
            
        }

        System.out.print("\nInput vakue for n : ");
        int n=input.nextInt();

        System.out.print("After rotating : ");
        for(int i=n; i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
        for (int i=0; i <(numbers.length)-(n+1); i++) {
            System.out.print(numbers[i]);
        }

        
    }
    
}
