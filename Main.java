import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Asal sayi bulunacak araliği belirleyecek sayiyi giriniz : ");
        int x = input.nextInt();
        int sayac = 0;

        for (int i = 1; i <= x; i++) {


            for (int j = i; j >= 1; j--) {


                if (i % j == 0) {
                    sayac++;
                }
            }
            if (sayac == 2) {

                System.out.println(i + "");
            }
        }


    }

    Scanner input = new Scanner(System.in);
    int result = 0
    int n = input.nextInt();
    for(
    int i = 1;
    i>=1;i++)

    {
        result = n * i;
        System.out.println(result);
    }

}
