package com.ksk.exam.board;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int idLast = 0;
    int idSave = 0;
    String titleSave = null;
    String bodySave = null;

    System.out.println("== 게시판 v 0.1 ==");
    System.out.println("== 프로그램 시작 ==");
    while(true)
    {
      System.out.print("명령)");
      String text = sc.nextLine();
      System.out.println("입력된 명령어는 : " + text );
      if(text.equals("exit"))
      {break;}
      else if(text.equals("/usr/article/write")) {
        System.out.println("- 게시물 등록 -");
        System.out.print("제목 :");
        String title = sc.nextLine();
        System.out.print("내용 :");
        String body = sc.nextLine();
        int id = idLast + 1;
        idLast = id;
        Article article = new Article(id, title, body);
        System.out.println("생성된 게시물 객체 : " + article);
        System.out.printf("%d번 게시물이 등록되었습니다.\n", id);
        idSave = id;
        titleSave = title;
        bodySave = body;
      }
      if(text.equals("/usr/article/detail"))
      {
        System.out.println("- 게시물 상세보기 -");
        System.out.println("번호 : " + idSave);
        System.out.println("제목 : " + titleSave);
        System.out.println("내용 : " + bodySave);
      }
    }

    System.out.println("== 프로그램 종료 ==");
  }
}
class Article {
  int id;
  String title;
  String body;

  Article(int id, String title, String body) // 객체의 형식 지정
  {
   this.id = id;
   this.title = title;
   this.body = body;
  }

  public String toString()
  {
    return String.format("{게시물 개수 : %d, 제목 : %s, 내용 : %s}", id, title, body);
  }

}
