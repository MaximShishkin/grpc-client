package ru.shishkin.coollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;

public class RunClass {

	public RunClass()
	{
		// ������� ������-������.
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al1 = new ArrayList<String>();
				
		System.out.println("��������� ������ al: " + al.size());
				
		// �������� �������� � ������-������.
		al.add("�");
		al.add("�");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		
		// �������� �������� � ������-������.
		al1.add("�");
		al1.add("�");
		al1.add("E");
		al1.add("B");
		al1.add("D");
		al1.add(1, "A2");
		
		System.out.println("������ al ����� �������: " +al.size());
			
		// ��������� ��������, ���������� � ��������� ���� ���� , � ���������, ��������� � ��������� �. 
		// ���������� �������� true, ���� �������� 
		// ���� ���������, � �������� false � � ��������� ������.
		al.addAll(al1);
		
		System.out.println("������ al ����� �������: " +al.size());
		
		// ���������� ������-������.
		System.out.println("���������� al: " + al);
				
		//static <�>Queue<T>asLifoQueue(Deque<T> �);
		
		// ���� � ������� �������� � ������������ � �.
		// ���������� ������� �������� ��� ������������� ��������, ���� �������� �� �������
		int k = Collections.binarySearch(al, "F", null); 
		System.out.println("������� ������� F: " + k);
		
		// ���������� ���������� � ��������� ����� ������������� ��������� ������� ����������. 
		// ������� �������� ������������� ������� ������� ����������ClassCastException
		// Collection<String> c = new HashSet<String>();
		// Collection<String> c = Collections.checkedCollection(new HashSet<String>(), String.class);
		
		// �������� �������� al � al2!
		//Collections.copy(al2, al);
		//System.out.println("������ al2 ����� �������: " +al2.size());
		
		// ���������� �������� � � � ���������� � �.
		// ���������� �������� true, ���� ��� ��������� �� �������� ����� ���������.
		// � ��������� ������ ���������� �������� false
		boolean t= Collections.disjoint(al1, al1);
		System.out.println("������� ������� F: " + t);
		
		// ���������� ������������, ������ ������ ���������� List ��������� ����
		List<String> al3 = new ArrayList<String>();
		al3=Collections.emptyList();
		
		// ���������� ������������ �� ������ e.
		Enumeration<String> e = Collections.enumeration(al);
		while(e.hasMoreElements()) {
	         System.out.print(" "+e.nextElement());
	    }
		 System.out.println();
		 
		// ����������� ������ ������� �������� ������
		// static <�> void fill(List<? super�>������, T ������);
		
		// ������������ ���������� ��������� ������� � � ���������� ���������
		k= Collections.frequency(al, "A2");
		System.out.println("����������� ��������� A2: " + k);
		
		// ���� � ������ ������ ��������� ���������������. 
		// ���������� ������ ������� ���������� ��� �������� -1, ���� ��������� �� �������
		k=Collections.indexOfSubList(al, al1);
		System.out.println("������ ��������� ��������� A2: " + k);
		
		// ���� � ������ ��������� ��������� ���������������. 
		// ���������� ������ ������� ���������� ��� �������� -1, ���� ��������� �� �������
		k=Collections.lastIndexOfSubList(al, al1);
		System.out.println("��������� ��������� ��������� A2: " + k);
		
		// ���������� ������ ������ ArrayList, ���������� �������� ������������
		List<String> al4 = new ArrayList<String>();
		al4 = Collections.list(e);
	    System.out.println("�������� al4: "+al4);
	    
	    // ���������� ������������ ������� �� �, ������������ ��� ������ ����������
	    System.out.println("������������ ������� �� al: "+Collections.max(al));
	    
	    // ���������� ����������� ������� �� �, ������������ ������������ ��������
	    System.out.println("����������� ������� �� al: "+Collections.min(al));
	    
	    // ���������� ����������� �����
	    System.out.println("����������� ����� � al: "+Collections.nCopies(0, al));
	    
	    // �������� ��� ��������� ������ �� ����� ������. 
	    // ���������� �������� true, ���� ��������� ���� �� ���� ������. 
	    Collections.replaceAll(al,"B", "�2");
		// ���������� ������-������.
		System.out.println("���������� al: " + al);
		
		// �������� ������������������ ��������� � ������ �� ��������
		Collections.reverse(al);
		// ���������� ������-������.
		System.out.println("���������� al: " + al);
		
		// ���������� ����������, �������� ����������� � ����������. 
		// �� ���� ������������ ���������� ��������� ������������������, �������� ���, ��� ������ ����������
		// create comparator for reverse order
	    Comparator<Object> cmp = Collections.reverseOrder(null);  
	    // ��������� �������� ������ � ������������ � ����������
	    Collections.sort(al, cmp);  
	    // ���������� ������-������.
		System.out.println("���������� al: " + al);
	    
		// ������� ������ �� � ������� ������. 
		// ��� �������� ����� ����������� ������������� �������� n
		Collections.rotate(al, -1);
		// ���������� ������-������.
		System.out.println("���������� al: " + al);
		
		// ������������ (��������� �������) �������� � ������, ��������� � � �������� ��������� ��������� �����
		Collections.shuffle(al,new Random());
		// ���������� ������-������.
		System.out.println("���������� al: " + al);
		
		// ������ ������� �������� ������, ����������� � �������� ������1 � ������2
		Collections.swap(al, 2, 5);
		// ���������� ������-������.
		System.out.println("���������� al: " + al);
		
		// ���������� ���������� � ��������� ������� ������, ����������� ���������� ������
		al3  = Collections.synchronizedList(al3);
		
		// ���������� ���������������� ������, ����������� ���������� ������
		al3  = Collections.unmodifiableList(al3);
	}
}
