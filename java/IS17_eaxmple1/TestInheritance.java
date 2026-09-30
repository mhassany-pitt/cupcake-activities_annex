class Person{
   private String name;
   public void setName(String n) {
      name = n;
   }
 
   public String getName(){
      return name;
   }
}

class Student extends Person{
   private String stuNum;
 
   public void setStuNum(String sn)   {
      stuNum = sn;
   }
 
   public String getStuNum()   {
      return stuNum;
   }
}

public class TestInheritance{
   public static void main(String[] args)   {
      Student stu = new Student();
      stu.setName("Sharon Hsiao");
      stu.setStuNum("12345");
      System.out.println("Student Name: " + stu.getName());
      System.out.println("Student Number: " + stu.getStuNum());
   }
} 