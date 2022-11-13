import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi=1,girilen,faktoriyel=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Faktöriyeli hesaplanacak sayıyı yazınız: ");
        girilen = input.nextInt();

        while (sayi<girilen){
            faktoriyel *= girilen;
            girilen--;
        }
        System.out.println(faktoriyel);

    }
}