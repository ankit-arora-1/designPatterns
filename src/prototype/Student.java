package prototype;

public class Student implements Prototype<Student> {
    private int age;
    private String name;
    private int psp;
    private int averageBatchPsp;
    private String batchName;
    private int counter;

    public Student() { }

    public Student(Student st) {
        this.age = st.age;
        this.name = st.name;
        this.psp = st.psp;
        this.averageBatchPsp = st.averageBatchPsp;
        this.batchName = st.batchName;
        this.counter = st.counter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public int getAverageBatchPsp() {
        counter += 1;
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(int averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    @Override
    public Student copy() {
        return new Student(this);
    }
}
