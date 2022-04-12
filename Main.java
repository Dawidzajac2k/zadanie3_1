import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try{
            Service1 s = new Service1();
      s.addStudent(new Student("Krzysztof", 20));
      s.addStudent(new Student("Janusz", 40));
      int k;
      System.out.println("Wybierz program:");
      System.out.println(" 1.Dodaj studenta\n 2.Wypisz wszystkich studentów");
      Scanner to = new Scanner(System.in);
         k =to.nextInt();
         switch(k)
         {
           case 1:
             String imie;
             int wiek;
             System.out.println("Wpisz Imie oraz wiek");
             Scanner z = new Scanner(System.in);
             imie = z.nextLine();
             wiek = z.nextInt();
             System.out.println("Dodano studenta powrot do menu");
             s.addStudent(new Student(imie, wiek));

         break;
           case 2:
         var students = s.getStudents();
        for(Student current : students) {
        System.out.println(current.ToString());
      }
         break;
         }
         }
     catch (IOException e) {
       
       }
    }
  }
