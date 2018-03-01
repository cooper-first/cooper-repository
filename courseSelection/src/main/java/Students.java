import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Students implements Comparable<Students> {
    public String id;
    public String name;
    public Set<Course> choosenCourses;
    public Scanner input = new Scanner(System.in);


    public Students(String id,String name) {
        this.id=id;
        this.name=name;
        this.choosenCourses = new HashSet<Course>();
    }



    public void choose(Students students) {
        CourseSelection courseselection = new CourseSelection();
        System.out.println("可选课程为：");
        courseselection.testAdd();
        System.out.println("\n请选择课程：" + students.name + "同学");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <4 ; i++) {
            System.out.print("请选第"+(i+1)+"个课程的ID:");
            String catchUser = input.next();
            for (Course element : courseselection.courseToSelect) {
                if (catchUser .equals(element.getId())) {
                    choosenCourses.add(element);
                }
            }

        }
        System.out.println(choosenCourses.size());

    }

    public void printChoosenCourses() {
        for (Course element : choosenCourses) {
            System.out.println("您选的课程序号为:"+element.getId()+"\t"+"\t"+"课程名称为：" + element.getName());
        }
    }

    public void testSetContains() {
        System.out.println("请输入您要查询的课程名称：");
        String name = input.next();
        Course course1 = new Course();
        course1.setName(name);
        System.out.println("您输入的课程为" + course1.getName());
        System.out.println(choosenCourses.contains(course1));


    }
    public static void main(String[] args) {
        Students students = new Students("1", "cooper");
        students.choose(students);
        students.printChoosenCourses();
        students.testSetContains();

    }




    public int compareTo(Students o) {
        return this.id.compareTo(o.id);
    }

}
