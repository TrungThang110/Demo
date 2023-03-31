public class Test {
    public static void main(String[] args) {
        StudentDAO studentDao = new StudentDaoImplement();

        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Sinh viên: [Số thứ tự : " + student.getRollNo() + ", Tên : " + student.getName() + " ]");
        }

        Student student =studentDao.getAllStudents().get(0);
        student.setName("Phát");
        studentDao.updateStudent(student);

        //get the student
        studentDao.getStudent(0);
        System.out.println("Sinh viên: [Số thứ tự : " + student.getRollNo() + ", Tên : " + student.getName() + " ]");
    }
}
