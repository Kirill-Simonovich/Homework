package com.homework.exception8;

/**
 * ������� ��������� � ��������, ��� ����������.
 * � ������ eat ������ ���� finally, ����� ��� ������� �����, ���� ���� ��� �� ������� ����������.
 *
 * ��������� ����� � ������, ����� food != null:
 * ���� ���
 * ����� ����
 * ��� ����
 * ��� �����
 *
 * ��������� ����� ����� food == null:
 * ���� ���
 * ������ �� �����
 * ��� ����� ��������
 * ����������:
 * �	� ������ eat ������ ���� ���� finally.
 * �	����� ������ ��������������� �������.
 */
public class Exceptions6 {

  public static void main(String[] args) {
    Lion lion = new Lion(); // ��������� � ����� Lion ctrl + ���� �� Lion
    lion.eat(new Food("����")); // ��������� � ����� Food ctrl + ���� �� Food
    lion.eat(null);
  }
}
