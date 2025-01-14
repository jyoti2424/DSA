import java.lang.reflect.Field;
import java.util.*;

class Student implements Comparable<Student>{
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(gpa, student.gpa) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gpa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGpa(),this.getGpa());
    }
}

public class Main {

   public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

     /*  //List as ArrayList
       List<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(12);
       list.add(23);

       //Get method
       System.out.println(list.get(2));
       // size
       System.out.println(list.size());
       for loop
       for(int i =0; i<list.size(); i++){
           System.out.println(list.get(i));
       }
       for(int x :list){
           System.out.println(x);
       }

       System.out.println(list.contains(3));
       System.out.println(list.contains(2));
       list.set(2,50);
       System.out.println(list);

       //ArrayList as List
      ArrayList<Integer> list = new ArrayList<>(11);
       list.add(1);
       list.add(1);
       list.add(1);
       list.add(1);
       list.add(1);
       list.add(1);
       list.add(1);
       list.add(1);
       list.add(1);
       list.add(1);
       list.add(1);

       System.out.println(list.size());
       list.add(1);
       System.out.println(list.size());
       list.remove(1);
       list.remove(1);
       list.remove(1);
       list.remove(1);
       System.out.println(list.size());
       list.trimToSize();

       List<String> list = new ArrayList<>();
       System.out.println(list.getClass().getName());

       //Fixed size ArrayList
       List<String> list1 = Arrays.asList("Monday", "Tuesday");
       System.out.println(list1.getClass().getName());
       list1.set(1, "Wednesday");
       System.out.println(list1.get(1));

       //Convert String array to fixed size  and immutable arrayList
       String[] array = {"Apple", "Banana", "Cherry"};
       List<String> list2 = Arrays.asList(array);
       System.out.println(list2.getClass().getName());

       //Now we can add element in fixed size array list by converting it to Arraylist
       List<String> list5 = new ArrayList<>(list2);
       list5.add("Mango");
       System.out.println(list5);

       //Fixed size and immutable List
       List<Integer> list3 = List.of(1, 2, 3, 4);
       //list3.set(1, 33); //throw error bcz it is immutable
       //list3.remove(2); //throw error
       System.out.println(list3);


       List<Integer> list4 = new ArrayList<>();
       list4.add(1);
       list4.add(2);
       list4.add(3);

       //remove object from list of Int type
       list4.remove(Integer.valueOf(1));
       System.out.println(list4);

       List<String> words = Arrays.asList("banana","apple","date");
       words.sort((a,b) -> b.length() - a.length());
       System.out.println(words);

       List<Integer> list = new ArrayList<>();
       list.add(2);
       list.add(1);
       list.add(3);

       list.sort((a, b) -> a - b);
       System.out.println(list);

       List<Student> students = new ArrayList<>();
       students.add(new Student("Charlie", 3.5));
       students.add(new Student("Bob", 3.7));
       students.add(new Student("Alice", 3.5));
       students.add(new Student("Akshit", 3.9));

       Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);

       students.sort(comparator);
       for (Student s : students) {
           System.out.println(s.getName() + ": " + s.getGpa());
       }*/

       List<Student> students = new ArrayList<>();
       students.add(new Student("Charlie", 3.5));
       students.add(new Student("Bob", 3.7));
       students.add(new Student("Alice", 3.5));
       students.add(new Student("Akshit", 3.9));

        Collections.sort(students);
        System.out.println(students);
   }
}
