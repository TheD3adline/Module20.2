import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> employees = new LinkedList<String>(); //LinkedList<> is very similar to ArrayList, but offers some additional functions
                                                                 //Compared to ArrayList it also offers faster access to write content, but the reading is slower
        employees.add("Rita");
        employees.add("Anna");
        employees.add("Markus");
        employees.add("Peter");

        employees.addLast("Last!!!");                         //.addLast adds the content at the very end of the list

        employees.addFirst("First!!!");                       //.addFirst adds the content at the start

        for(int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.println();

        System.out.println(employees.toString());

        employees.remove(3);
        employees.remove("Rita");

        System.out.println();

        for(int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.println();

        System.out.println(employees.toString());

        employees.removeFirst();                               //.removeFirst removes the first content of the list
        employees.removeLast();                                //.removeLast removes the last content of the list

        System.out.println();

        for(int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.println();

        System.out.println(employees.toString());
    }
}