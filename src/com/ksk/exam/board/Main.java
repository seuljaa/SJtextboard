package com.ksk.exam.board;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int i = 1;
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
        System.out.printf("%d번 게시물이 등록되었습니다.\n", i);
        i++;
      }
    }
    System.out.println("== 프로그램 종료 ==");
  }
}
