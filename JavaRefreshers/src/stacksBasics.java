import java.util.Stack;

public class stacksBasics {

    public static void main(String[] args) {

        Stack<String> animals = new Stack<>();

        animals.push("CAT");
        animals.push("lion");
        animals.push("goat");
        animals.push("dog");
        System.out.println(animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());
        System.out.println(animals.search("goat"));

    }
}
