package com.homework.string2;

import java.util.Scanner;

/**
 * Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.
 * Требования:
 * •	Программа должна считывать две строки c клавиатуры.
 * •	Если строки одинаковые, то программа должна вывести сообщение "строки одинаковые".
 * •	Если строки разные, то программа должна вывести сообщение "строки разные".
 */

public class StringVariable {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String first = scanner.nextLine();
    String second = scanner.nextLine();
    if (first.equals(second)) {
      System.out.println("строки одинаковые");
    } else {
      System.out.println("строки разные");
    }
  }
}
