 public class Student{
private String name;
 private String email;
private double cgpa;

public Student(String name, String email, double cgpa){
this.name=name;
this.email=email;
this.cgpa=cgpa;
}
public String getName(){
return name;
}
public String getemail(){
return email;
}
public double getCgpa(){
return cgpa;
}

public void setName(String name){
this.name=name;
}
public void setEmail(String email){
this.email=email;
}
public void setcgpa(double cgpa){
this.cgpa=cgpa;
}

public void display(){
System.out.println("Student Name"+name);
System.out.println("Student email"+email);
System.out.println("Student cgpa"+cgpa);
}
}


