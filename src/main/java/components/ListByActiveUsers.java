package components;

import DTO.ListDTO;
import utility.Initialize;

public class ListByActiveUsers implements MyList {

	Initialize init = new Initialize();

	public String[] getList(String filter) {
		init.readDataLineByLine("data.csv");
		return null;
	}
}
