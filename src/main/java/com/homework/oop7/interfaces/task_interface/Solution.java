package com.homework.oop7.interfaces.task_interface;

import java.util.ArrayList;
import java.util.List;

/**
 * � ������� ��������� ���� �������� �������, � � ������� ���������� � ���������.
 * ���-�� ��� ������� � ����������� �� ���� �������� ����������� �� �����������, � ��� ��������� � ����.
 * ������ �������� ��������� ���� �����������. � �����������, ����� ����� ��� �������� ������ ���� �������.
 *
 * ��� �����:
 *
 * � ������ createKeyboardOrchestra() ������ � ������ orchestra ���� ����� � ��� �������;
 * � ������ createStringedOrchestra() ������ � ������ orchestra ��� ������� � ���� ������;
 * ����� playOrchestra() ������ �������� ����� play() � ���� ��������� ������ orchestra.
 * ����������:
 * �	����� createKeyboardOrchestra() ������ ��������� � ������ orchestra ���� ������ ������ Organ � ��� ������� Piano.
 * �	����� createStringedOrchestra() ������ ��������� � ������ orchestra ��� ������� ������ Violin � ���� ������ Guitar.
 * �	����� playOrchestra() ������ �������� ����� play() � ���� ��������� ������ orchestra.
 */

public class Solution {
  static List<MusicalInstrument> orchestra = new ArrayList<>();

  public static void main(String[] args) {
    createKeyboardOrchestra();
    createStringedOrchestra();
    playOrchestra();
  }

  public static void createKeyboardOrchestra() {
    orchestra.add(new Organ());
    orchestra.add(new Piano());
    orchestra.add(new Piano());
    orchestra.add(new Piano());
  }

  public static void createStringedOrchestra() {
    orchestra.add(new Violin());
    orchestra.add(new Violin());
    orchestra.add(new Guitar());
  }

  public static void playOrchestra() {
    for (MusicalInstrument mi: orchestra) {
      mi.play();
    }
  }
}
