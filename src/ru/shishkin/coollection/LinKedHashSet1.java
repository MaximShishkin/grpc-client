package ru.shishkin.coollection;

import java.util.LinkedHashSet;

public class LinKedHashSet1 {
    public LinKedHashSet1() {
        // ������ ���������, ������� ������ ���-�������
        // ������ ���������, ������� ������ ��������� ���-�������
        LinkedHashSet<String> al = new LinkedHashSet<String>();

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
