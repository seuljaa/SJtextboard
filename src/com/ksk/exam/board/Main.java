package com.ksk.exam.board;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int id = 1;
    System.out.println("== 게시판 v 0.1 ==");
    System.out.println("== 프로그램 시작 ==");
    while(true)
    {
      System.out.print("명령)");
      String text = sc.nextLine();
      System.out.println("입력된 명령어는 : " + text );
      if(text.equals("exit"))
      {break;}
      else if(text.equals("/usr/article/write"))
      {

        System.out.println("- 게시물 등록 -");
        System.out.print("제목 :");
        String title = sc.nextLine();
        System.out.print("내용 :");
        String body = sc.nextLine();

        Article article = new Article();
        article.id = id;
        article.title = title;
        article.body = body;

        System.out.println("생성된 게시물 객체 : " + article);
        System.out.printf("%d번 게시물이 등록되었습니다.\n", id);
        id++;
      }
    }
    System.out.println("== 프로그램 종료 ==");
  }
}
class Article {
  int id;
  String title;
  String body;

  public String toString()
  {
    return String.format("게시물 개수 : %d, 제목 : %s, 내용 : %s", id, title, body);
  }

}
