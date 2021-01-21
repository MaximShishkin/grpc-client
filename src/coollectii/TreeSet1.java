package coollectii;

import java.util.TreeSet;

public class TreeSet1 {
	public TreeSet1()
	{
		// Коллекция для хранения информации в виде дерева
		TreeSet<String> al = new TreeSet<String>();
						
		System.out.println("Начальный размер al: " + al.size());
						
		// Добавить элементы в массив-список.
		al.add("С");
		al.add("А");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		System.out.println("Размер al после вставки: " +al.size());
						
		// отобразить массив-список.
		System.out.println("Содержимое al: " + al);
						
		// Удалить элементы из массива-списка,
		al.remove("F");
						
		System.out.println("Размер al после удалений: " + al.size());
		System.out.println("Содержимое al: " + al) ;
						
		// Получить массив.
		String ia[] = new String[al.size()];
		ia = al.toArray(ia);
						
		System.out.println("Содержимое al: " + ia[0]);
					
		System.out.println("Содержимое al: " + al) ;
					
	}
}
