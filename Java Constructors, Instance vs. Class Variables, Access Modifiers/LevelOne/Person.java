package LevelOne;
 class PersonDetail{


     public class Person {

         private String name;
         private int age;

         public Person(String name,int age){
             this.name=name;
             this.age = age;
         }
         public Person(Person another){
             this(another.name, another.age);
         }
     }

 }
public class Person {
    public static void main(String[] args) {
        PersonDetail p = new PersonDetail();
    }
}
