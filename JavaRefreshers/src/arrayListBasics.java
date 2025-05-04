import java.util.ArrayList;
import java.util.Iterator;

public class arrayListBasics {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>(); //creating an arrraylist


        name.add("test"); // adding elements to arraylist
        name.add("test2");
        name.add("test3");
        name.add("test6");

        System.out.println(name);

        name.add(2, "testnew"); // adding element at particular index
        System.out.println(name);

        System.out.println(name.get(3)); // printing element from given index
        name.remove(4); // removing element from the index

        System.out.println(name);
        name.remove(String.valueOf("test2")); // removing element by passing value

        System.out.println(name);
        name.set(2, "testset"); // updating the value using index
        System.out.println(name);

        System.out.println(name.contains("testset")); // finding element with value

        Iterator<String>  it = name.iterator(); // iterator is used to iterate through all the values from array  list
        while(it.hasNext()){
            System.out.println(it.next());
        }




    }


}
