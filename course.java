package university;

public class course {
    String coursename;
    String instructor;
    int studentenrolled;

    course(String courseName, String instructorName, int enrolledStudents) {
        coursename = courseName;
        instructor = instructorName;
        studentenrolled = enrolledStudents;
    }

    public void setcoursName(String courseN) {
        // this. for private elements
        coursename = courseN;
    }

    public String getrsecouName() {
        return coursename;

    }

    public void setinstructName(String instruct) {
        // this. for private elements
        instructor = instruct;
    }

    public String getinstructName() {
        return instructor;
    }

    public void setenroll(int enrollment) {
        // this. for private elements
        studentenrolled = enrollment;
    }

    public int getenroll() {
        return studentenrolled;
    }

    @Override
    public String toString() {
        return " course name: " + coursename + " instructor name: " + instructor + " stidents enrolled "
                + studentenrolled;
    }

    public static void main(String[] args) {

        course Cpeg = new course(" Cpeg ", " abdullah ", 26);
        System.out.println(Cpeg);
    }

}
