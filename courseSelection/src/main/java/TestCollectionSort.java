import java.util.*;

public class TestCollectionSort {
    Random random = new Random();
    List<String> stringList = new ArrayList<String>();
    StringBuilder X = new StringBuilder("迪士尼");
  //包含生成随机字符串的方法
    public String getChar(int randomLength) {
        String string = "0123456789QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
        //长度为62
        if (randomLength == 0) {
            return null;
        }
        StringBuilder stringPrint = new StringBuilder();
        char char1;
        for (int i = 0; i < randomLength; i++) {
            char1 = string.charAt(random.nextInt(61));
            stringPrint.append(char1);

        }
        //stringPrint.insert(0, "成都");
        return stringPrint.toString();

    }

    public void stringToSort() {
        int i = 0;
        while (i<10) {
            String listElement = getChar(random.nextInt(9));
            if (listElement==null) {
                continue;
            }
            if (stringList.contains(listElement)) {
                continue;
            }
            stringList.add(listElement);

            i++;
        }
        System.out.println("-----------排序前---------------");
        System.out.println("随机生成的字符串总共有"+stringList.size()+"条\n");
        for (String element:stringList) {
            System.out.println(element);

        }
        System.out.println("------------排序后--------------");
        Collections.sort(stringList);
        for (int j = 0; j <stringList.size() ; j++) {
            System.out.println(stringList.get(j));
            }
    }

    public void studentsToSort() {
        List<Students> studentsList = new ArrayList<Students>();
        Set<String> stringSet1 = new HashSet<String>();
        //生产3个不同的正整数来作为学生的ID
        Students[] studentsArray = {new Students(null, "王博文"), new Students(null, "郑仁平"),
                new Students(null, "陈日天")};
        while (true) {
            String a= String.valueOf(random.nextInt(100));
            stringSet1.add(a);
            if (stringSet1.size() == 3) {
                break;
            }
        }
        int i = 0;
        System.out.println("----------排序前------------");
        for (String element : stringSet1) {

            studentsArray[i].id = element;
            studentsList.add(studentsArray[i]);
            System.out.println(studentsList.get(i).id+"\t"+studentsList.get(i).name);
            i++;
        }
        System.out.println("-----------排序后-----------------");
        Collections.sort(studentsList);
        for (Students element:studentsList) {
            System.out.println(element.id+"\t"+element.name);

        }
    }
    public static void main(String[] args) {
        TestCollectionSort test1 = new TestCollectionSort();
        //test1.stringToSort();
        //System.out.println(test1.X);
        //System.out.println(test1.s);
        test1.studentsToSort();

    }
}
