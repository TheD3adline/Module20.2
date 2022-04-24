import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> employees = new LinkedList<String>();

        employees.add("Rita");
        employees.add("Anna");
        employees.add("Markus");
        employees.add("Peter");

        for(int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.println();

        System.out.println(employees.toString());
    }
}