import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> employees = new LinkedList<String>();

        employees.add("Rita");
        employees.add("Anna");
        employees.add("Markus");
        employees.add("Peter");

        employees.addLast("Last!!!");

        employees.addFirst("First!!!");

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

        employees.removeFirst();
        employees.removeLast();

        System.out.println();

        for(int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.println();

        System.out.println(employees.toString());

        //Pro/Con of LinkedList: Faster access to add or remove content compared to ArrayList, but slower read
    }
}