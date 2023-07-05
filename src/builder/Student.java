package builder;

public class Student {
    private String name;
    private int age;
    private String univName;
    private String batchName;
    private String phone;

    private Student(Builder builder) {
        // Validations
        if(builder.getAge() > 100) {
            throw new IllegalArgumentException("Wrong age");
        }

        this.name = builder.getName();
        this.age = builder.getAge();
        this.univName = builder.getUnivName();
        this.batchName = builder.getBatchName();
        this.phone = builder.getPhone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    // As Builder is a nested class of Student so it does not exist until Student object created

     static class Builder {
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

        public Student build() {
            return new Student(this);
        }
    }
}
