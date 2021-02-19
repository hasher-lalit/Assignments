package components;

import java.util.List;

import DTO.ListDTO;
import utility.Initialize;

public class ListByActiveUsers implements MyList {

	Initialize init = new Initialize();

	public List<ListDTO> getList(String filter, int number) {
		init.readDataLineByLine("data.csv");
		return null;
	}
}
