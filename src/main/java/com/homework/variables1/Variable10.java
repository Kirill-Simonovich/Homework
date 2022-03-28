package com.homework.variables1;

import java.util.Scanner;

/**
 * Напиши программу, которая считывает с клавиатуры два вещественных числа (double) и выдает сообщение о том,
 * равны ли эти числа с точностью до одной миллионной.
 * Требования:
 * •	Программа должна считывать два числа c клавиатуры.
 * •	Если числа равны, то программа должна вывести сообщение "числа равны".
 * •	Если числа не равны, то программа должна вывести сообщение "числа не равны".
 * •	Точность сравнения должна достигать одной миллионной (0.000001).
 */

public class Variable10 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double firstDouble = scanner.nextDouble();
    double secondDouble = scanner.nextDouble();

    //Math.abs() — дает абсолютное значение аргумента, простыми словами — мы получаем модуль числа.
    if (Math.abs(secondDouble - firstDouble) < 0.000001) {
      System.out.println("числа равны");
    } else {
      System.out.println("числа не равны");
    }
  }
}
