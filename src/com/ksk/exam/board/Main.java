package com.ksk.exam.board;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);

    System.out.println("== 게시판 v 0.1 ==");
    System.out.println("== 프로그램 시작 ==");
    while(true)
    {
      System.out.print("명령)");
      String text = sc.nextLine();
      System.out.println("입력된 명령어는 : " + text );
      if(text.equals("exit"))
      {break;}
    }
    System.out.println("== 프로그램 종료 ==");
  }
}
