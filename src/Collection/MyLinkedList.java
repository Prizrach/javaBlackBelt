package Collection;


import java.util.LinkedList;

public class MyLinkedList {
        public static void main(String[] args) {
            Student1 student1 = new Student1("Ivan", 'm');
            Student1 student2 = new Student1("Nikolay", 'm');
            Student1 student3 = new Student1("Elena", 'f');
            Student1 student4 = new Student1("Petr", 'm');
            Student1 student5 = new Student1("Mariya", 'f');

            LinkedList studentList = new LinkedList();
            studentList.add(student1);
            studentList.add(student2);
            studentList.add(student3);
            studentList.add(student4);
            studentList.add(student5);
            studentList.add(student5);
            System.out.println(studentList);

        }

}

class Student1 {
    private String name;
    private char sex;

    public Student1(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }
}
