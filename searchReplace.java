import java.util.Scanner;
public class searchReplace
{
    public static void main() {
        Scanner sc= new Scanner(System.in);
        String st=sc.nextLine();
        String result="";
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='e')
            result=result+'i';
            else
            result=result+st.charAt(i);
        }
        System.out.println(result);
    }
}