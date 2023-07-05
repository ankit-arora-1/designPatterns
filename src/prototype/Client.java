package prototype;

import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();
        st.setAge(12);
        st.setName("asdas");
        st.setBatchName("apr22");
        st.setAverageBatchPsp(50);


        Student copy = st.copy();

        Student intelligentStudent = new IntelligentStudent();
        intelligentStudent.setAge(12);
        intelligentStudent.setName("is");

        Student copyOfIs = intelligentStudent.copy();
    }
}
