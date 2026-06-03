class student{
    private String name;
    private int age;
    private String salary;

    public void setName(String n){
        name = n;
    }

    public void setAge(int a){
        age = a;
    }

    public void setSalary(String s){
        salary = s;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getSalary(){
        return salary;
    }
}

public class studentexample {
    public static void main (String [] args){
        student s1 = new student();
        s1.setName("John");
        s1.setAge(20);
        s1.setSalary("5000");
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Salary: " + s1.getSalary());
    }
}
