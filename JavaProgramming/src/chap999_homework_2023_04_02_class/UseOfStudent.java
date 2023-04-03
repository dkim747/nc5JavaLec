package chap999_homework_2023_04_02_class;

import java.util.ArrayList;
import java.util.Scanner;

import chap999_homework_2023_04_02.Student;

public class UseOfStudent {
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<Student>();
    Scanner scanner = new Scanner(System.in);

    System.out.println("학생 정보 입력을 시작합니다. 입력을 중단하려면 quit을 입력하세요.");

    while (true) {
      System.out.print("학생 이름: ");
      String name = scanner.nextLine();
      if (name.equals("quit")) {
        break;
      }

      System.out.print("학생 학번: ");
      String id = scanner.nextLine();

      System.out.print("학생 전공: ");
      String major = scanner.nextLine();

      Student student = new Student(name, id, major);
      students.add(student);
    }

    System.out.println("학생정보:");
    for (Student student : students) {
      System.out.println("학생 이름: " + student.getName());
      System.out.println("학생 학번: " + student.getId());
      System.out.println("학생 전공: " + student.getMajor());
      System.out.println();
    }
  }
}