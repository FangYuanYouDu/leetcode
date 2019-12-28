package com.langri.datastructure.stack;

/**
 * @author LR
 * @version 1.0.0
 * @date 2019/12/24 15:30
 */
public class ValidParentheses {
    //s "{[(}])"
    public boolean isValid(String s){
        ArrayStack<Character> stack = new ArrayStack<Character>();
        for (int i = 0; i <s.length(); i++) {
            char c = s.charAt(i);
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char poop = stack.poop();
                if(poop == '(' && c != ')'){
                    return false;
                }
                if(poop == '[' && c != ']'){
                    return false;
                }
                if(poop == '{' && c != '}'){
                    return false;
                }
            }
        }
        return true;
    }
}
