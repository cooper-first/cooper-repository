import java.util.Objects;

/**
 * 课程类，通过课程类可以获取课程的名字和id号。
 */
public class Course {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course() {

    }

    public Course(String id, String name) {
        setId(id);
        setName(name);

    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Course)) {
            return false;
        }
        Course course = (Course) obj;

        if (course.getName() == null) {
            if (this.getName() == null) {
                return true;
            } else {
                return false;
            }
        }
        if (this.getName().equals(course.getName())) {
            return true;
        } else {
            return false;
        }


    }




    public static void main(String[] args) {
        Course test1 = new Course();

    }
}


