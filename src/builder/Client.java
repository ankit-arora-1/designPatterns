package builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();
//        builder.setName("abc");
//        builder.setAge(12);
//        builder.setPhone("1231231231");
//
//        Student student = new Student(builder);
//        System.out.println(student.getAge());
//        System.out.println(student.getName());

//        Builder builder = Student.getBuilder();
//        builder.setName("abc");
//        builder.setAge(12);
//        builder.setPhone("1231231231");
//
//        Student student = builder.build();

        Student student = Student.getBuilder()
                .setName("asa")
                .setAge(12)
                .setBatchName("asdas")
                .build();

    }
}
