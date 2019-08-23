import java.util.Scanner;
import java.util.Stack;

public class OptionalTaskTwo {

    public static void main(String[] args) {
        Stack stack = new Stack();
        int n=0;
        System.out.println("Input number ");
        Scanner sc1 = new Scanner(System.in);
        n = sc1.nextInt();

        char [] numbers = String.valueOf(n).toCharArray();

        for(char num : numbers){
            stack.push(num);}

        while(!stack.empty()) {
            char stackNum;
            stackNum = (Character)stack.pop();
            System.out.print(stackNum);
        }
    }
}
