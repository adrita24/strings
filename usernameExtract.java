import java.util.Scanner;
public class usernameExtract
{
    public static void main() {
        Scanner sc= new Scanner(System.in);
        String email=sc.nextLine();
        int i=0;
        String username="";
        do{
            username+=email.charAt(i);
            i++;
            if(email.charAt(i)=='@')
            break;
        }while(i<email.charAt(i));
        System.out.println("username is "+username);
    }
}
