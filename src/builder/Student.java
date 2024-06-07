package builder;

public class Student {
    private String name;
    private int age;
    private String universityName;
    private double psp;
    private Gender gender;
    private String phoneNumber;
  public Student (Builder builder){
       this.name = builder.getName();
       this.age= builder.getAge();
       this.psp= builder.getPsp();
       this.gender=builder.getGender();
       this.phoneNumber= builder.getPhoneNumber();
       this.universityName=builder.getUniversityName();
  }

  public static Builder createStudentBuilder(){
      return  new Builder();
  }
}
