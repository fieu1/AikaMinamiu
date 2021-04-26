/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet8;

/**
 *
 * @author MeiMei
 */
public class Prefix {
    int n;
    int top;
    char stack[];

    public Prefix(int total) { 
        n = total; //declare total value
        top = -1; //top of empty stack 
        stack = new char[n]; //instantiation stack
        push('('); //push ( to stack
    }

    public void push(char c) { //insert data to stack
        top++;  //increase top index
        stack[top] = c; //input c to stack
    }

    public char pop() { //take the data in top index in stack
        char item = stack[top]; //save value of data that want to take
        top--; //decrease top index
        return item; //return to show the data that will taken
    }

    public boolean IsOperand(char c) { //check are the char is operand
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == '.') { 
            //condition when c is an ooperand
            return true; //return true
        } else { //in other condition
            return false; //return false
        }
    }
    public boolean IsOperator(char c){ //check are the char is operator
        if(c == '^' || c == '%'|| c == '*'|| c == '+'|| c == '/'|| c == '-'){ //conditions when c is operator
           return true; //return true
        } else { // other condition
            return false; //return false
        }
    }
    public int presedence(char c ){ //check the position of hierarchy
        switch(c){
            case '^' : return 3;   // ^ is have a highest position
            case '%' : return 2;   // % have a second  position
            case '/' : return 2;   // * have a second  position
            case '*' : return 2;   // / have a second  position
            case '+' : return 1;   // + have a third position
            case '-' : return 1;   // - have a third position
            default : return 0;    //no position
        }    
    }
    
    public String postConverter(String Q){ //for converting to postfix
        String P = ""; //place for save postfix
        char c; //char for checking
        for (int i=0; i<n; i++){ //"for" iteration
            c=Q.charAt(i); //c value will change with the part of Q string
            if(IsOperand(c)){ //when c is operand 
                P = P + c; //it will be added to P string
            }
            if(c == '('){ //if c was a "("
                push(c); //c will be pushed to stack
            }
            if(c == ')'){ //if c was a ")"
                while(stack[top] != '('){ //Iteration when the top of stack is not (
                    P = P + pop(); //P will be added with the value of top of the stack
                }
                char temp = pop(); 
            }
            if(IsOperator(c)){ //when c is operator
                while(presedence(stack[top]) >= presedence(c)){ 
                //when the precedence of top of stack is bigger or same with c's precedence 
                    P = P + pop(); //P will be added with value of top of the stack
                }
                // if it smaller than stack[top] precedence
                push(c); //push c to the stack 
            }
        }
        return P; //return string P
    }
    
    public String reverse(String S){ //for reversing String S
        String rev =""; //String rev for place for reversing
        char r; //char to checking
        for(int i=n-1; i>=0;i--){ //"for" iteration
            r = S.charAt(i); //change r value 
            if(r == ')'){ //if r is ")"
                r = '('; //change value to "("
                rev = rev + r; //add r to rev String
            } else if (r == '('){ //if r is "("
                r = ')'; //change value to ")"
                rev = rev + r; //add r to rev String
            } else { //other condition
                rev = rev + r; //add r to rev String 
            }
        }
        return rev; //return String rev
    }
    public String preConverter(String conv){ //for prefix converter
        String revForPost, converted, revPre = ""; 
        //place for converting and reversing
        revForPost = reverse(conv); //reversing 
        converted = postConverter(revForPost); //convert to postfix 
        n = converted.length(); //check converted string length
        revPre = reverse(converted); //reversing 
        return revPre; //return reversed value
    }
}
