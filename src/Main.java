import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Witaj");
        System.out.println("Podaj login:");
        Scanner scanner=new Scanner(System.in);
        String  login= scanner.nextLine();

        System.out.println("Podaj haslo:");
        Scanner scanner1=new Scanner(System.in);
        String haslo=scanner.nextLine();

        if ((login=="login")&&(haslo=="haslo")) //do poprawy!!!!!!
            System.out.println("Logowanie poprawne");
        else {
            System.out.println("Bledny login lub haslo");
        }


    }
}
