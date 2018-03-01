import java.lang.reflect.Array;
import java.util.*;

public class CourseSelection {
    public List<Course> courseToSelect;
    private Scanner input = new Scanner(System.in);
    public String H = "new";



    public CourseSelection() {

        this.courseToSelect = new ArrayList<Course>();
    }




    public void testAdd() {
        Course one = new Course("1", "微积分"), two = new Course("2","佛教理论");
        courseToSelect.add(one);
        courseToSelect.add(two);
        Course[] three = new Course[2];
        three[0] = new Course("3", "C语言");
        three[1] = new Course("4", "JAVA");
        courseToSelect.addAll(2, Arrays.asList(three));
        courseToSelect.add(2, one);
        Course catchThree = courseToSelect.set(2, new Course("5", "半导体物理"));
        //System.out.println("序号为："+""+catchThree.getId()+"\t"+"名称为"+catchThree.getName());
        courseToSelect.add(new Course("6", "成都"));
        System.out.println();
        Iterator  it= courseToSelect.iterator();
        while (it.hasNext()) {
            Course catchElement = (Course) it.next();
            System.out.println("序号为："+""+catchElement.getId()+"\t"+"\t"+"名称为"+catchElement.getName());

        }
        //查找课程非正常方法如下：使用了return语句

        /*String name = input.next();
        for (Course element : courseToSelect) {
            if (element.getName().equals(name)) {
                return "找到的课程名称为："+name;
            }
        }
        return "该课程不存在";
       */
        //以下是删除多个元素的方法.
        /*Object[] course = { one,  two};
        courseToSelect.removeAll(Arrays.asList(course));
        System.out.println("\n"+"尴尬"+"\n");
        Iterator  iterator= courseToSelect.iterator();
        while (iterator.hasNext()) {
            Course catchElement = (Course) iterator.next();
            System.out.println("序号为："+""+catchElement.getId()+"\t"+"名称为"+catchElement.getName());

        }
*/
        }

    public void testContains() {
        //查找课程正常方法如下使用了contains方法
        System.out.println("请输入当前要查找的课程名称");
        String name = input.next();
        Course course2 = new Course();
        course2.setName(name);
        System.out.println("您输入的名称为：" +course2.getName());
        System.out.println(courseToSelect.contains(course2));
        System.out.println("返回为ture代表存在" + "\t" + "返回为false代表不存在");
        if (courseToSelect.contains(course2)) {
            System.out.println("该课程的索引位置为" + courseToSelect.indexOf(course2));
        }

    }





    public static void main(String[] args) {
        CourseSelection temp1 = new CourseSelection();
        temp1.testAdd();
        temp1.testContains();

    }

}

