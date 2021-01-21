package coollectii;

import java.util.LinkedList;

public class LinkedList1 {
	public LinkedList1()
	{
			// Создать связанный список.
			LinkedList<String> al = new LinkedList<String>();
				
			System.out.println("Начальный размер al: " + al.size());
				
			// Добавить элементы в массив-список.
			al.add("С");
			al.add("А");
			al.add("E");
			al.add("B");
			al.add("D");
			al.add("F");
			al.add(1, "A2");
			System.out.println("Размер al после вставки: " +al.size());
				
			// отобразить массив-список.
			System.out.println("Содержимое al: " + al);
				
			// Удалить элементы из массива-списка,
			al.remove("F");
			al.remove(2);
				
			System.out.println("Размер al после удалений: " + al.size());
			System.out.println("Содержимое al: " + al) ;
				
			// Получить массив.
			String ia[] = new String[al.size()];
			ia = al.toArray(ia);
				
			System.out.println("Содержимое al: " + ia[0]);
			
			// Удалить первый и последний элементы.
			al.removeFirst();
			al.removeLast();
			
			System.out.println("Содержимое al: " + al) ;
			
			// Получить и присвоить значение.
			String val = al.get(2);
			al.set(2, val + " Изменен");
			System.out.println("11 после изменения: " + 11);
			
			System.out.println("Содержимое al: " + al) ;
	}
}
