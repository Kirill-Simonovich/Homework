package com.homework.exception8;

/**
 * ������ ���, ����� ��������� ���������������, �� ��������� try-catch.
 * ����������:
 * �	� ������ main �� ������ ���� ����� try-catch.
 * �	����� main ������ ������� ����������.
 * �	����� main ������ �������� ����� generateLuckyNumber().
 * �	����� generateLuckyNumber �������� ������.
 */

public class Exceptions7 {

  public static void main(String[] args) throws Exception {
    generateLuckyNumber();
  }

  static void generateLuckyNumber() throws Exception {
    int luckyNumber = (int) (Math.random() * 100);
    if (luckyNumber == 13) {
      throw new Exception("�� �������");
    }
    System.out.println("���� ���������� �����: " + luckyNumber);
  }
}
