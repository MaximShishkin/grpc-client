package ru.shishkin.coollection;

import java.util.ArrayList;

public class ArrayList1 {
	
	public ArrayList1()
	{
		// ������� ������-������.
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("��������� ������ al: " + al.size());
		
		// �������� �������� � ������-������.
		al.add("�");
		al.add("�");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		System.out.println("������ al ����� �������: " +al.size());
		
		// ���������� ������-������.
		System.out.println("���������� al: " + al);
		
		// ������� �������� �� �������-������,
		al.remove("F");
		al.remove(2);
		
		System.out.println("������ al ����� ��������: " + al.size());
		System.out.println("���������� al: " + al) ;
		
		// �������� ������.
		String ia[] = new String[al.size()];
		ia = al.toArray(ia);
		
		System.out.println("���������� al: " + ia[0]);
	}
}
