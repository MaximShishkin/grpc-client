package coollectii;

import java.util.ArrayDeque;

public class ArrayDeque1 {
	public ArrayDeque1()
	{
		// Создать двухстороннюю очередь.
		// создает динамический массив, не имеющий ограничений емкости
		ArrayDeque<String> adq = new ArrayDeque<String>();
			
		// Использование ArrayDeque в виде стека.
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
			
		System.out.print("Выталкиваем из стека: ");
			
		while(adq.peek() != null)
		System.out.print(adq.pop() + " ");
		System.out.println();	
	}
}
