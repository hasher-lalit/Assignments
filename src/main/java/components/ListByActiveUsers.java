package components;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import DTO.ListDTO;
import DTO.RowDTO;
import utility.Initialize;

public class ListByActiveUsers implements MyList {

	Initialize init = new Initialize();
	RowDTO list[];
	List<ListDTO> result;
	HashMap<String, Integer> count;

	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
		// Create a list from elements of HashMap
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});

		// put data from sorted list to hashmap
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

	public List<ListDTO> getList(String filter, int number) {
		list = init.readDataLineByLine("data.csv");
		result = new ArrayList();
		for (int i = 0; i < list.length; i++) {
			count = new HashMap<String, Integer>();
			if (list[i] == null) {
				continue;
			}
			LocalDate date = list[i].getDate();
//			System.out.println(i);

			while (i<list.length&&list[i] != null&&date.equals(list[i].getDate())) {
				if (count.containsKey(list[i].getUrl())) {
					count.put(list[i].getUrl(), count.get(list[i].getUrl()) + 1);
				} else {
					count.put(list[i].getUrl(), 1);
				}
				i++;
			}
			Map<String, Integer> sortedMap = sortByValue(count);
			int block = number;
			List<String> resultUrls = new ArrayList<String>();
			for (Map.Entry<String, Integer> en : sortedMap.entrySet()) {
				if (block-- == 0)
					break;
				resultUrls.add(en.getKey());
			}
			result.add(new ListDTO(date.toString(), resultUrls));
			i--;
		}
		return result;
	}

}
