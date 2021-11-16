package com.ksk.exam.board;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write your code here
    System.out.println("== 게시판 v 0.1 ==");
    System.out.println("== 프로그램 시작 ==");
    System.out.print("명령)");
    Scanner sc = new Scanner(System.in);
    String a;
    a = sc.next();
    System.out.println("입력된 명령어 : " + a);


    System.out.println("== 프로그램 종료 ==");
  }
}
