
import java.util.*;

public class LoginSystem {
    public static void main(String[] args) {
        String  id;
        String pass;
        int i=0;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("login system");
        System.out.println("silahkan masukkan :");

        while (i<4) {

            //input id username
            System.out.print("username: ");
            id = inputUser.next();

            //input password
            System.out.print("password: ");
            pass = inputUser.next();

            // compare string id dan pass

            if (id.equals("upj") && pass.equals("upj123")){
                System.out.println("selamat datang");
                return ;
            }else{
                System.out.println("username dan password salah, ini percobaan ke-"+(i+1));
            }
            i++;

        }
        System.out.println("percobaan sudah mencapai batas maksimal yaitu 3x, silahkan hubungi adm00n");



    }
}
