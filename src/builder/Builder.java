package builder;

public class Builder {
    private String name;
    private int age;
    private String univName;
    private String batchName;
    private String phone;

    public String getName() {
        return name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getUnivName() {
        return univName;
    }

    public Builder setUnivName(String univName) {
        this.univName = univName;
        return this;
    }

    public String getBatchName() {
        return batchName;
    }

    public Builder setBatchName(String batchName) {
        this.batchName = batchName;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

//    public Student build() {
//        return new Student(this);
//    }
}
