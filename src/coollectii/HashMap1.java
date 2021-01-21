package coollectii;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
	public HashMap1()
	{
		// Карта (шар) — это объект, который сохраняет ассоциации между ключами
		// и значениями, или пары “ключ-значение”. 
		// Создаёт коллекцию, которая хранит хеш-таблицу
		
		// Создать хеш-карту.
		HashMap<String, Double> hm = new HashMap<String, Double>();
		
		// Поместить элементы в карту
		hm.put("Джон Доу", new Double(3434.34));
		hm.put("Том Смит", new Double(123.22));
		hm.put("Джейн Бейкер", new Double(1378.00));
		hm.put("Toм Холл", new Double(99.22));
		hm.put("Ральф Смит", new Double(-19.08));
		
		// Получить набор элементов.
		Set<Map.Entry<String, Double>> set = hm.entrySet();
		
		// Отобразить набор.
		for(Entry<String, Double> me : set) 
		{
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		
		System.out.println();
		
		// Добавить 1000 на счет Джона Доу.
		
		double balance = hm.get("Джон Доу");
		hm.put("Джон Доу ", balance + 1000);
		System.out.println("Новый баланс Джона Доу: " +hm.get("Джон Доу"));
	}	
}
