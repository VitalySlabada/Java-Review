import java.util.*;
import java.util.spi.CalendarDataProvider;

public class ArrayListReview {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Jose"));
        students.add(new Student(2, "Vitaly"));
        students.add(new Student(3, "Vasya"));


        System.out.println(students);

        // 1 - for loop

        for (int i = 0; i < students.size(); i++) System.out.println(students.get(i));

        //2. Iterator
        Iterator iter = students.listIterator();
        //forward iteration
        System.out.println("print forward with iterator");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        //backward iteration
        System.out.println("print backward with iterator");
        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }


        //3. For each loop

        System.out.println("/n/nfor each loop");

        for (Student each : students) {
            System.out.println(each);
        }

        //4. Lambda

        System.out.println("Lambda");

        students.forEach(student -> System.out.println(student));

        System.out.println("sort by id, desc ");
        Collections.sort(students, new sortByIDDesc());
        System.out.println(students);

        System.out.println("sort by name, desc ");
        Collections.sort(students, new sortByNameDesc());
        System.out.println(students);

    }

    static class sortByIDDesc implements Comparator<Student>{

        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }


    static class sortByNameDesc implements Comparator<Student>{

        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}

