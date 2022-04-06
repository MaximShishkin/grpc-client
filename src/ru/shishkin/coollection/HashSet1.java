package ru.shishkin.coollection;

import java.util.HashSet;

public class HashSet1 {
    public HashSet1() {
        // ������ ���������, ������� ������ ���-�������
        HashSet<String> al = new HashSet<String>();

        System.out.println("��������� ������ al: " + al.size());

        // �������� �������� � ������-������.
        al.add("�");
        al.add("�");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        System.out.println("������ al ����� �������: " + al.size());

        // ���������� ������-������.
        System.out.println("���������� al: " + al);

        // ������� �������� �� �������-������,
        al.remove("F");

        System.out.println("������ al ����� ��������: " + al.size());
        System.out.println("���������� al: " + al);

        // �������� ������.
        String ia[] = new String[al.size()];
        ia = al.toArray(ia);

        System.out.println("���������� al: " + ia[0]);
    }
}
