package lesson5;

public class Person {
    public String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    public int age;



    public Person(){
        name = "Ivanov Ivan";
        position = "Engineer";
        email = "ivivan@mailbox.com";
        phoneNumber = "892312312";
        salary = 30000;
        age = 26;
    }

    public Person(String nam, String posit, String ema, String phone, int sal, int ag){
        name = nam;
        position = posit;
        email = ema;
        phoneNumber = phone;
        salary = sal;
        age = ag;
    }

    public void info(){
        System.out.printf("name: %s position: %s email: %s phoneNumber: %s salary %d age: %d ", name, position, email, phoneNumber, salary, age );
        System.out.println();
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", position='" + position + '\'' +
//                ", email='" + email + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                ", salary=" + salary +
//                ", age=" + age +
//                '}';
//    }



}


