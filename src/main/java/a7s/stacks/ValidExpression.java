package a7s.stacks;

import java.util.Stack;

/*
https://practice.geeksforgeeks.org/problems/valid-expression1025/1/
 */

public class ValidExpression {

    public static boolean valid(String s){
        /*
        TODO: Use array deque instead of stack class as it might be faster
         */
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if (c=='('||c=='{'||c=='['){
                st.push(c);
            }else{
                if (st.empty()){
                    return false;
                }else {
                    char c_pop=st.pop();
                    if (c_pop=='('){
                        if (c!=')'){
                            return false;
                        }
                    } else if (c_pop=='{'){
                        if (c!='}'){
                            return false;
                        }
                    } else{
                        if (c!=']'){
                            return false;
                        }
                    }
                }

            }
        }
        if (st.empty()){
            return true;
        }else{
            return false;
        }
    }

    public static boolean validUsingCounters(String s)
    {
        // code here
        int c1=0;
        int c2=0;
        int c3=0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='('){
                c1+=1;
            }else if(s.charAt(i)=='{'){
                c2+=1;
            }else if(s.charAt(i)=='['){
                c3+=1;
            }else if(s.charAt(i)==')'){
                c1-=1;
            }else if(s.charAt(i)=='}'){
                c2-=1;
            }else{
                c3-=1;
            }
            if (c1<0||c2<0||c3<0){
                return false;
            }
        }
        if(c1==0&&c2==0&&c3==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s="()[]{}";
        System.out.println(valid(s));
    }
}
