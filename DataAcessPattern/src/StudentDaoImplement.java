import java.util.ArrayList;
import java.util.List;

public class StudentDaoImplement implements StudentDAO{
    List<Student> students;

    public StudentDaoImplement(){
        students = new ArrayList<Student>();
        Student student1 = new Student("Thắng",0);
        Student student2 = new Student("Quân",1);
        Student student3 = new Student("Hiếu",2);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
    }
}
