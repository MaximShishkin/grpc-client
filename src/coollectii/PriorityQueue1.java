package coollectii;

import java.util.PriorityQueue;

public class PriorityQueue1 {
	public PriorityQueue1 ()
	{
		// Очередь с приоритетами на базе компаратора очереди. 
		// Создать двухстороннюю очередь.
		PriorityQueue<String> adq = new PriorityQueue<String>();
			
		// Добавление элементов
		adq.add("A");
		adq.add("B");
		adq.add("D");
		adq.add("E");
		adq.add("F");
		adq.add("F");
				
		System.out.print("Выталкиваем из стека: ");
					
		while(adq.peek() != null)
		System.out.print(adq.poll() + " ");
		
	}

}
