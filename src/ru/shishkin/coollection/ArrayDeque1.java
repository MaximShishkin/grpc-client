package ru.shishkin.coollection;

import java.util.ArrayDeque;

public class ArrayDeque1 {
    public ArrayDeque1() {
        // ������� ������������� �������.
        // ������� ������������ ������, �� ������� ����������� �������
        ArrayDeque<String> adq = new ArrayDeque<String>();

        // ������������� ArrayDeque � ���� �����.
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.print("����������� �� �����: ");

        while (adq.peek() != null)
            System.out.print(adq.pop() + " ");
        System.out.println();
    }
}
