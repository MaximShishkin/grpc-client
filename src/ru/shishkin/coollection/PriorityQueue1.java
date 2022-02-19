package ru.shishkin.coollection;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public PriorityQueue1 ()
	{
		// ������� � ������������ �� ���� ����������� �������. 
		// ������� ������������� �������.
		PriorityQueue<String> adq = new PriorityQueue<String>();
			
		// ���������� ���������
		adq.add("A");
		adq.add("B");
		adq.add("D");
		adq.add("E");
		adq.add("F");
		adq.add("F");
				
		System.out.print("����������� �� �����: ");
					
		while(adq.peek() != null)
		System.out.print(adq.poll() + " ");
		
	}
}
