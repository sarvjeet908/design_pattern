package builder;

public class Client {
    public static void main(String[] args) {

        Builder builder = new Builder();
        builder.setName("sarvjeet");
        builder.setAge(26);
        builder.setGender(Gender.MALE);
        builder.setPsp(97.5);
        builder.setPhoneNumber("7541016769");
        builder.setUniversityName("msruas");
//        Student student1 = new Student(builder);
//        Student student2 = new Student(builder);




        //Student student=new Student(builder);
        Student.createStudentBuilder();
    }
}