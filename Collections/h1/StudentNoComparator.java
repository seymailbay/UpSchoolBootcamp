package Collections.Odev1;

import java.util.Comparator;

public class StudentNoComparator implements Comparator<Student> {


    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.no, s2.no);
    }
}
