package components;

import DTO.ListDTO;
import utility.Initialize;

public class ListByActiveUsers implements MyList {

	Initialize init = new Initialize();

	public ListDTO[] getList(String filter, int number) {
		init.readDataLineByLine("data.csv");
		return null;
	}
}
