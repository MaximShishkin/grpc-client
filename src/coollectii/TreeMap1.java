package coollectii;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
	public TreeMap1()
	{
		// Карта (шар) — это объект, который сохраняет ассоциации между ключами
		// и значениями, или пары “ключ-значение”. 
		// Коллекция для хранения информации в виде дерева
				
		// Создать карту-дерево.
		TreeMap<String, Double> tm = new TreeMap<String, Double>();
					
		// Поместить элементы в карту.
		tm.put(" Д ж о н Доу", new Double (3434.34));
		tm.put("Том Смит", new Double(123.22));
		tm.put("Джейн Бейкер", new Double(1378.00));
		tm.put("Toм Халл", new Double(99.22));
		tm.put("Ральф Смит", new Double(-19.08));
					
		// Получить набор элементов.
		Set<Map.Entry<String, Double>> set = tm.entrySet();
					
		// Отобразить элементы.
		for(Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
		System.out.println();
					
		// Добавить 100 0 на счет Джона Доу.
		double balance = tm.get(" Д ж о н Доу");
		tm.put( " Д ж о н Доу", balance + 1000);
		System.out.println("Новый баланс Джона Доу: " + tm.get(" Д ж о н Доу"));
	}
}
