package com.homework.methods5;

/**
 *
 ������������� �������

 ����� ����� ���������, ������� ������� ���������� � �������� � �������. � ���������, ��� �� �������������.
 ������ ����������� ����������� ���������� ������������� ������� � ������ Person, ����� ��� ���������������.
 ����������:
 �	��� ������ ���������������.
 �	����� �������� ����������� ����������� ���������� ������������� ������� � ������ Person.
 */

// ����� person � ����� ������
public class Method9 {

  public static void main(String[] args) {
    Person person = new Person("����", "������");
    System.out.println("�����.");
    System.out.println("���: " + person.getFirstName());
    System.out.println("�������: " + person.getLastName());
    System.out.println("������ ���: " + person.getFullName());
  }
}
