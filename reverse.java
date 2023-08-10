public class reverse
{
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("Hello");
        StringBuilder st= new StringBuilder("");
        for(int i=str.length()-1;i>=0;i--) {
            st.append(str.charAt(i)); 
        }
        System.out.println(st);
    }
}
/* for(int i=0;i<str.length()/2;i++) {
/*    front=i;
 * back=str.length()-1-i;
 * str.setChar(front,str.charAt(back));
 * str.setCharAt(back,str.charAt(front));
 */