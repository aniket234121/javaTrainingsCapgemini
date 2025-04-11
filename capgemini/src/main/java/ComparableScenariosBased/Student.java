package ComparableScenariosBased;

public class Student implements Comparable {
    int rollNo;
    int grade;
    Student(int rollNo,int grade) {
        this.rollNo = rollNo;
        this.grade=grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", grade=" + grade +
                '}';
    }

    public int compareTo(Object o)
    {
        Student s = (Student)o;
        if(this.rollNo!=s.rollNo)
        {
            Integer i=this.grade;
            Integer i2=s.grade;
            return i.compareTo(i2);
        }

        else
        {
            Integer i=this.rollNo;
            Integer i2=s.rollNo;
            return i.compareTo(i2);
        }
    }
}
