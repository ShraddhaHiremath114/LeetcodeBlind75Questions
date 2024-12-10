import java.util.*;
public class ValidParanthesis {
    public static void main(String[] args) {
        String str="{()}";
        int n=str.length();

        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{'){
                st.push(str.charAt(i));
            }else if(str.charAt(i)==')'){
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }
            }else if(str.charAt(i)=='}'){
                if(!st.isEmpty() && st.peek()=='{'){
                    st.pop();
                }
            }else{
                System.out.println("False");
                break;
            }

        }
        if(st.isEmpty()){
            System.out.println("True");
        }
    }
}
