package coollectii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;

public class algoritm {
	public algoritm()
	{
		// Создать массив-список.
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al1 = new ArrayList<String>();
				
		System.out.println("Начальный размер al: " + al.size());
				
		// Добавить элементы в массив-список.
		al.add("С");
		al.add("А");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		
		// Добавить элементы в массив-список.
		al1.add("С");
		al1.add("А");
		al1.add("E");
		al1.add("B");
		al1.add("D");
		al1.add(1, "A2");
		
		System.out.println("Размер al после вставки: " +al.size());
			
		// Вставляет элементы, переданные в параметре элем енты , в коллекцию, указанную в параметре с. 
		// Возвращает значение true, если элементы 
		// были добавлены, и значение false — в противном случае.
		al.addAll(al1);
		
		System.out.println("Размер al после вставки: " +al.size());
		
		// отобразить массив-список.
		System.out.println("Содержимое al: " + al);
				
		//static <Т>Queue<T>asLifoQueue(Deque<T> с);
		
		// Ищет в списоке значение в соответствии с с.
		// Возвращает позицию элемента или отрицательное значение, если значение не найдено
		int k = Collections.binarySearch(al, "F", null); 
		System.out.println("Позиция элемета F: " + k);
		
		// Возвращает безопасное в отношении типов представление коллекции времени выполнения. 
		// Попытка вставить несовместимый элемент вызовет исключениеClassCastException
		// Collection<String> c = new HashSet<String>();
		// Collection<String> c = Collections.checkedCollection(new HashSet<String>(), String.class);
		
		// Копирует элементы al в al2!
		//Collections.copy(al2, al);
		//System.out.println("Размер al2 после вставки: " +al2.size());
		
		// Сравнивает элементы в а с элементами в Ь.
		// Возвращает значение true, если две коллекции не содержат общих элементов.
		// В противном случае возвращает значение false
		boolean t= Collections.disjoint(al1, al1);
		System.out.println("Позиция элемета F: " + t);
		
		// Возвращает неизменяемый, пустой объект интерфейса List заданного типа
		List<String> al3 = new ArrayList<String>();
		al3=Collections.emptyList();
		
		// Возвращает перечисление на основе e.
		Enumeration<String> e = Collections.enumeration(al);
		while(e.hasMoreElements()) {
	         System.out.print(" "+e.nextElement());
	    }
		 System.out.println();
		 
		// Присваивает объект каждому элементу список
		// static <Т> void fill(List<? superТ>список, T объект);
		
		// Подсчитывает количество вхождений объекта с и возвращает результат
		k= Collections.frequency(al, "A2");
		System.out.println("Колличество элементов A2: " + k);
		
		// Ищет в список первое вхождение вложенныйСписок. 
		// Возвращает индекс первого совпадения или значение -1, если вхождение не найдено
		k=Collections.indexOfSubList(al, al1);
		System.out.println("Первое вхождение элементов A2: " + k);
		
		// Ищет в список последнее вхождение вложенныйСписок. 
		// Возвращает индекс первого совпадения или значение -1, если вхождение не найдено
		k=Collections.lastIndexOfSubList(al, al1);
		System.out.println("Последнее вхождение элементов A2: " + k);
		
		// Возвращает объект класса ArrayList, содержащий элементы перечисление
		List<String> al4 = new ArrayList<String>();
		al4 = Collections.list(e);
	    System.out.println("Значения al4: "+al4);
	    
	    // Возвращает максимальный элемент из с, определенный при помощи компаратор
	    System.out.println("Максимальный элемент из al: "+Collections.max(al));
	    
	    // Возвращает минимальный элемент из с, определенный естественным порядком
	    System.out.println("Минимальный элемент из al: "+Collections.min(al));
	    
	    // Возвращает колличество копий
	    System.out.println("Колличество копий в al: "+Collections.nCopies(0, al));
	    
	    // Заменяет все вхождения старый на новый список. 
	    // Возвращает значение true, если выполнена хотя бы одна замена. 
	    Collections.replaceAll(al,"B", "А2");
		// отобразить массив-список.
		System.out.println("Содержимое al: " + al);
		
		// Изменяет последовательность элементов в список на обратную
		Collections.reverse(al);
		// отобразить массив-список.
		System.out.println("Содержимое al: " + al);
		
		// Возвращает компаратор, обратный переданному в компаратор. 
		// То есть возвращенный компаратор порождает последовательность, обратную той, что делает компаратор
		// create comparator for reverse order
	    Comparator<Object> cmp = Collections.reverseOrder(null);  
	    // Сортирует элементы список в соответствии с компаратор
	    Collections.sort(al, cmp);  
	    // отобразить массив-список.
		System.out.println("Содержимое al: " + al);
	    
		// Смещает список на п позиций вправо. 
		// Для смещения влево используйте отрицательное значение n
		Collections.rotate(al, -1);
		// отобразить массив-список.
		System.out.println("Содержимое al: " + al);
		
		// Перемешивает (случайным образом) элементы в список, используя г в качестве источника случайных чисел
		Collections.shuffle(al,new Random());
		// отобразить массив-список.
		System.out.println("Содержимое al: " + al);
		
		// Меняет местами элементы список, находящиеся в позициях индекс1 и индекс2
		Collections.swap(al, 2, 5);
		// отобразить массив-список.
		System.out.println("Содержимое al: " + al);
		
		// Возвращает безопасный в отношении потоков список, наполненный элементами список
		al3  = Collections.synchronizedList(al3);
		
		// Возвращает немодифицируемый список, наполненный элементами список
		al3  = Collections.unmodifiableList(al3);
	}

}
