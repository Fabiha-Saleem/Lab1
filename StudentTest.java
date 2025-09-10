public class StudentTest{
public static voidmain(String args[]){
Student s1= new Student("Fabiha" , "fabi@gmail.com", 3.9);
s1.display();
System.out.println("Updates");
s1.setName("Sania");
s1.setEmail("sania@gmail.com");
s1.setCgpa("4.0");
s1.display();
}
}