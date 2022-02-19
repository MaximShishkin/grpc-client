package ru.shishkin.coollection;

import java.util.TreeSet;

public class TreeSet1 {

	public TreeSet1()
	{
		// ��������� ��� �������� ���������� � ���� ������
		TreeSet<String> al = new TreeSet<String>();
						
		System.out.println("��������� ������ al: " + al.size());
						
		// �������� �������� � ������-������.
		al.add("�");
		al.add("�");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		System.out.println("������ al ����� �������: " +al.size());
						
		// ���������� ������-������.
		System.out.println("���������� al: " + al);
						
		// ������� �������� �� �������-������,
		al.remove("F");
						
		System.out.println("������ al ����� ��������: " + al.size());
		System.out.println("���������� al: " + al) ;
						
		// �������� ������.
		String ia[] = new String[al.size()];
		ia = al.toArray(ia);
						
		System.out.println("���������� al: " + ia[0]);
					
		System.out.println("���������� al: " + al) ;
	}
}
