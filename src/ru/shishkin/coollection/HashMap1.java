package ru.shishkin.coollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
    public HashMap1() {
        // ����� (���) � ��� ������, ������� ��������� ���������� ����� �������
        // � ����������, ��� ���� �����-��������.
        // ������ ���������, ������� ������ ���-�������

        // ������� ���-�����.
        HashMap<String, Double> hm = new HashMap<String, Double>();

        // ��������� �������� � �����
        hm.put("���� ���", new Double(3434.34));
        hm.put("��� ����", new Double(123.22));
        hm.put("����� ������", new Double(1378.00));
        hm.put("To� ����", new Double(99.22));
        hm.put("����� ����", new Double(-19.08));

        // �������� ����� ���������.
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        // ���������� �����.
        for (Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        // �������� 1000 �� ���� ����� ���.

        double balance = hm.get("���� ���");
        hm.put("���� ��� ", balance + 1000);
        System.out.println("����� ������ ����� ���: " + hm.get("���� ���"));
    }
}
