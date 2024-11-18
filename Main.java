
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        SecondGreatestInteger s= new SecondGreatestInteger();
        System.out.println(s.find());
        Scanner sc = new Scanner(System.in);
        PrimeNumber p=new PrimeNumber();
        p.num=sc.nextInt();
        System.out.println(p.check());
    }
}
