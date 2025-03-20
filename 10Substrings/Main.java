
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // String emailx = "eneslaya323@gmail.com";
        // String email = "htl121231331313@outlook.com";

        // String subs = emailx.substring(0,3); //ene
        // String subs = emailx.substring(3); // 3. indexden başlayıp geri kalanını alır
        // System.out.println(subs);
        // System.out.println(subs);
        

        // String username = email.substring(0, email.indexOf("@"));
        // String domain = email.substring(email.indexOf("@")+1); //@ den sonrasını alsın
        // System.out.println("Username is: "+  username+ "-----" +"Domain name is: "+domain);



        Scanner input = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.println("Please enter your email: ");
        email = input.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);
            System.out.println("Hello user "+ username + "!" + " domain name is: " + domain);

        }else{
            System.out.print("Email must contain @ Character");
        }
    


        input.close();

    }
}