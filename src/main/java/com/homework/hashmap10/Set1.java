package com.homework.hashmap10;

import java.util.HashSet;

/**
 * � ������ Set1 ���� ����� arrayToHashSet(String[]), ������� ������ �� ����������� ������� ������� HashSet<String> � ���� �� ����������.
 * ����� main �� ��������� � ��������.
 * ����������:
 * �	� ������ Set1 ������ ���� public static HashSet<String> arrayToHashSet(String[]) �����.
 * �	����� arrayToHashSet(String[]) ������ ���� ���������� �������� �������.
 */

public class Set1 {
  public static void main(String[] args) {
    String[] array = {"�����", "���", "����", "�", "����", "Senior", "Java", "Developer"};
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
    System.out.println("___________________________________");

    HashSet<String> hashSet = arrayToHashSet(array);
    for(String s : hashSet) {
      System.out.println(s);
    }
  }

  public static HashSet<String> arrayToHashSet(String[] strings) {
    return null;//�������� ��� ��� ���
  }
}
