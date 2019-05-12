package sample;

import java.util.Stack;



public class InfixToPostfixAlgo {

    public String infixToPostfixConversation(String exp)

    {
        int i;

        Stack s= new Stack();

        char temp;

        String output="";

        for(i=0; i<exp.length();i++)
        {

            temp=exp.charAt(i);

            if (Character.isLetterOrDigit(temp))

            {
                output += temp;

                System.out.println("Stała lub zmienna na wyjście: " +output);


            }
            else if (temp == '(')

                push(temp);

            else if (temp ==')')

            {
                while(!isEmpty()&& stackTop()!='(')

                {

                    output+=pop();

                }

                if(isEmpty())
                    return "expression not valid";
                else
                    pop();
            }
            else{ //an operator has been encountered
                while(!isEmpty()&&(precedence(temp)<= precedence(stackTop())))

                {
                    output+=pop();

                }
                push(temp);
            }
        }
        while (!isEmpty())

            output +=pop();
        return output;

    }




    public int precedence (char c)
    {

        switch (c) {

            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;

    }


    int top=-1;

    static final int MAX=1000;
    char[] stack=new char[MAX];

    public void push(char element) {
        if (top > MAX)
            System.out.println("Stos jest pełny");

        else

            stack[++top] = element;

        System.out.println("połóż na stos: " + element);
    }

    public char pop() {

        if (!isEmpty()) {


            if (stack[top] == '(')

            { System.out.println("Zdejmij ze stosu nie dawaj na wyjście: " + stack[top]);
                return stack[top--];}

                else

            {System.out.println("Zdejmij ze stosu na wyjście: " + stack[top]);
            return stack[top--];}
        }
        else {

            System.out.println("Stos jest pusty");
            return 0;

        }
    }



    public boolean isEmpty() {

        if (top < 0) {

            System.out.println("Stos jest pusty");

            return true;
        } else
            return false;
    }



    public char stackTop() {

        return stack[top];

    }


}
