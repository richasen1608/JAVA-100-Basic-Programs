import java.util.Stack;

public class BalanceParenthesisStack {
    public static boolean isBalanced(String exp){
        Stack<Character> stack=new Stack<>();

        for(char c:exp.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }
            else if(c==')'||c=='}'||c==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(!isMatchingPair(top,c)){
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }
    private static boolean isMatchingPair(char open,char close){
        return (open =='('&& close==')')||
                (open=='{'&& close=='}')||
                (open=='['&& close==']');
    }

    public static void main(String[] args) {
        String exp="{{{}}}";
        if (isBalanced(exp)) {

            System.out.println("balanced");
        }
        else{
            System.out.println("not balanced");
        }

    }
}
