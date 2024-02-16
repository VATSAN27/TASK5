
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFilter {
    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Andrew", "David", "Eve", "Frank", "Grace", "Henry", "Ivy", "Jack");

        List<String> specialGiftStudents = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students eligible for special gifts: " + specialGiftStudents);
    }
}