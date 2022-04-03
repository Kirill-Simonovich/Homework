package com.homework.exception8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * ��������� ��������� � ������� �����, ������� � ������� ���������������� �������� � �������� ��� ��������.
 * �� ���� ��������: ���� � ������� ��� �������� � ������ �������, ��������� ����������� � ����������� ArrayIndexOutOfBoundsException.
 * ������ ���� ������ � try-catch, ����� ��������� ���������� ��������.
 * � ����� catch ������ � ������� ��������� "�������� � ����� ������� �� ����������".
 * ����������:
 * �	���� ������ ������ ���� �������� � try-catch.
 * �	��������� ������ ���������� ������, ���� ��� ������ �������������� �����.
 * �	��������� ������ �������� ��������� "�������� � ����� ������� �� ����������" ������ ��� ��� ����� ��������������� ������.
 */

public class Exceptions1 {

  public static final String PROMPT_STRING = "������� ����� ��������, ��� exit ��� ������: ";
  public static final String EXIT = "exit";
  public static final String ANSWERING = "�������� ";
  public static final String NOT_EXIST = "�������� � ����� ������� �� ����������";

  static List<String> studentsJournal = Arrays.asList(
      "����� ������"
      , "�������� �������"
      , "����� ������"
      , "����� �����������"
      , "������ �������"
      , "������� ����������"
      , "������ �������"
      , "������� ���������"
      , "����� ���������"
      , "������� ���������");

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print(PROMPT_STRING);
      String input = scanner.nextLine();
      if (input.toLowerCase().equals(EXIT)) {
        break;
      }

      int studentId = Integer.parseInt(input);
      try {
        System.out.println(ANSWERING + studentsJournal.get(studentId));
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(NOT_EXIST);
      }
    }
  }
}
