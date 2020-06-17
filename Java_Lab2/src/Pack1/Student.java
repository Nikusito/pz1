package Pack1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Student>{
    private String name;
    private String last_mame;
    private double arage_Grade;

    public Student(String name, String last_mame, double arage_Grade) {
        this.name = name;
        this.last_mame = last_mame;
        this.arage_Grade = arage_Grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_mame() {
        return last_mame;
    }

    public void setLast_mame(String last_mame) {
        this.last_mame = last_mame;
    }

    public double getArage_Grade() {
        return arage_Grade;
    }

    public void setArage_Grade(double arage_Grade) {
        this.arage_Grade = arage_Grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", last_mame='" + last_mame + '\'' +
                ", arage_Grade=" + arage_Grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.arage_Grade, arage_Grade) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(last_mame, student.last_mame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, last_mame, arage_Grade);
    }

    @Override
    public int compareTo(Student o) {
        if (this.name.equals(o.getName())&&this.last_mame.equals(o.getLast_mame())&& this.arage_Grade == o.getArage_Grade())
        return 0;
        else if (arage_Grade>o.getArage_Grade())
            return 1;
        else
            return -1;

    }
}
