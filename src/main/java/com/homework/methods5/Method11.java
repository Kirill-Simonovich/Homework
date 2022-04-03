package com.homework.methods5;

/**
 * ����� printSqrt(int[] array) ������ �������� ������ ���������� ��� ������� �������� ����������� �������.
 * �� ����� �� ���������� ��-�� ��������� ���� ����������. ������� ����� ���������� ���, ����� ��� ��������������.
 * � ���������� ������ ��������� ������ �������� � ������� ��������������� ������ ��� ������� �������� �������.
 *
 * ������ ������:
 * ������ ���������� ��� ����� 64 ����� 8.0
 * ����������:
 * �	��� ������ ���������������.
 * �	����� printSqrt(int[] array) ��� ������� �������� ������� ������ �������� ������ �������� �������.
 */


public class Method11 {
  public static void main(String[] args) {
    int[] array = {15,64,9,51,42};
    printSqrt(array);
  }

  public static void printSqrt(int[] array) {
    String elementSqrt = "������ ���������� ��� ����� ";
    for (int i = 0; i < array.length; i++) {
      int element = array[i];
      double elemSqrt = Math.sqrt(element);
      System.out.println(elementSqrt + element + " ����� " + elemSqrt);
    }
  }
}
