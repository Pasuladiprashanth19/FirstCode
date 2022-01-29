import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> Values = new TreeSet<>();
        Values.add(5);
        Values.add(6);
        Values.add(8);
        Values.add(9);
        for (int i :Values)
        System.out.println(i);
    }
}
