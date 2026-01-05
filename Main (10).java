import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("241RDB316  Vladislav Ebert");
        System.out.println("5. variants");

        System.out.println("input number: ");

        byte n = sc.nextByte();
        byte mask = 0;


        for (int i = 0; i < 8; i += 2) {
            mask += (byte) (1 << i);
        }

        byte sifretais_n = (byte) (n ^ mask);

        System.out.println(sifretais_n);



        sc.close();
    }
}