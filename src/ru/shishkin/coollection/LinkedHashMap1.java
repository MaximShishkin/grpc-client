package ru.shishkin.coollection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {
    public LinkedHashMap1() {
        // ����� (���) � ��� ������, ������� ��������� ���������� ����� �������
        // � ����������, ��� ���� �����-��������.
        // ������ ���������, ������� ������ ��������� �������

        // ������� �����-������.
        LinkedHashMap<String, Double> tm = new LinkedHashMap<String, Double>();

        // ��������� �������� � �����.
        tm.put(" � � � � ���", new Double(3434.34));
        tm.put("��� ����", new Double(123.22));
        tm.put("����� ������", new Double(1378.00));
        tm.put("To� ����", new Double(99.22));
        tm.put("����� ����", new Double(-19.08));

        // �������� ����� ���������.
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // ���������� ��������.
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        System.out.println();

        // �������� 100 0 �� ���� ����� ���.
        double balance = tm.get(" � � � � ���");
        tm.put(" � � � � ���", balance + 1000);
        System.out.println("����� ������ ����� ���: " + tm.get(" � � � � ���"));
    }
}
