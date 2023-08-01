
public class Main {
    public static void main(String[] args) {
        String str = "fghdjgthcrs";
        int strlen = str.length();
        if (strlen % 2 != 0) {
            str = str + '0';
            strlen = strlen + 1;


            int strlen2 = strlen / 2;
            System.out.println("strlen =" + strlen);
            System.out.println("strlen/2 =   " + strlen2);

            for (int i = 0; i <= strlen2-1; i++) {
                System.out.println(str.charAt(i));
            }
            System.out.println("      ");
            for (int i = strlen2; i <= strlen-1; i++) {
                System.out.println(str.charAt(i));
            }
            System.out.println("Вроде так )))");

        }
    }
}