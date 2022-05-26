import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the value of n1 giriniz : ");
        int n1 = input.nextInt();
        System.out.print("Please enter the value of n2 giriniz : ");
        int n2 = input.nextInt();
        int ebob = 1;
        int ekok = 1;
        int Ebob;
        int Ekok;
        if (n1 <= n2) {
            for (int i = n1; i >= 1; i--) {
                if (n1 % i == 0 && n2 % i == 0) {

                    ebob = i;
                    break;
                }
            }
            for (int k = 1; k <= n1 * n2; k++) {
                if (k % n1 == 0 && k % n2 == 0) {
                    ekok = k;
                    break;
                }
            }
            System.out.println("Least Common Multiple :" +ekok);
            System.out.println(    "Highest Common Factor : " + ebob);

        } else {
            for (int t = n1; t >= 1; t--) {
                if (n1 % t == 0 && n2 % t == 0) {
                    Ebob = t;
                    System.out.println(    "Highest Common Factor : " + Ebob);
                    break;

                }
            }
            for (int p = 1; p <= n1 * n2; p++) {
                if (p % n1 == 0 && p % n2 == 0) {
                    Ekok = p;
                    System.out.println("Least Common Multiple : " +Ekok);


                    break;


                }

            }

        }


    }

}