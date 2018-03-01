import java.util.*;

public class MapTest {
    public Map<String, Students> studentMap;


    public MapTest() {
        this.studentMap = new HashMap<String, Students>();
    }

    public void putStudents() {
        System.out.println();
        System.out.println("欢迎来到电子科大学生管理系统：\n");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <4 ; i++) {
            System.out.print("请输入学生的ID:");
            String id = input.next();
            if (studentMap.get(id) == null) {

                System.out.println("\n请输入该学生的姓名：");
                String name = input.next();
                Students st = new Students(id, name);
                studentMap.put(id, st);
                System.out.println(st.name + "添加成功!");
            } else {
                System.out.println("该学生ID已被占用请重新输入学生ID");
                continue;
            }

        }
    }

    public void printStudentMap() {
        System.out.println("共有" + studentMap.size() + "名学生!");
        Collection<Students> valueSet=studentMap.values();
        //for (Students student : valueSet) {
           // System.out.println(student.name + student.id);
        //}
        Set<String> keySet = studentMap.keySet();
        for (String set : keySet) {
            Students st = studentMap.get(set);
            System.out.println("\n" + "学生ID为"+st.id+"\t"+st.name);

        }
    }

    public void remove() {
        while (true) {

            System.out.println("请输入要删除学生的ID：");
            Scanner input = new Scanner(System.in);
            String catchUser = input.next();
            if (studentMap.get(catchUser) == null) {
                System.out.println("请重新输入");
                continue;
            } else {
                Students st = studentMap.get(catchUser);
                System.out.println("将要被删除的学生的姓名为：" + st.name);
                System.out.println("确定要删除TA么：确定请输入1，不是请输入0");
                String catchuser = input.next();
                if (catchuser.equals("1")) {
                    studentMap.remove(catchUser);
                    System.out.println("删除成功");
                } else {
                    continue;
                }

                break;
            }

        }

    }

    public void modify() {
        while (true) {
            System.out.println("请输入要更改学生的ID");
            Scanner input = new Scanner(System.in);
            String catchUser = input.next();
            if (studentMap.get(catchUser) == null) {
                System.out.println("不存在该ID请重新输入");
                continue;
            } else {
                Students st = studentMap.get(catchUser);
                System.out.println("该ID现在对应的学生姓名为：" + st.name);
                System.out.println("请输入该ID修改后的学生姓名为：");
                String name = input.next();
                Students newst = new Students(catchUser, name);
                studentMap.put(catchUser, newst);
                break;
            }
        }
        //注意下面的entry类型的set集合的写法，因为entry也是包括类型的.
        Set<Map.Entry<String, Students>> entrySet = studentMap.entrySet();
        for (Map.Entry<String,Students> entry:entrySet) {
            System.out.println("键值是"+entry.getKey());
            System.out.println("对应的姓名是"+entry.getValue().name);
        }
    }

    public static void main(String[] args) {
        MapTest mapTest = new MapTest();
        mapTest.putStudents();
        mapTest.printStudentMap();
        mapTest.remove();
        mapTest.printStudentMap();
    }

}
