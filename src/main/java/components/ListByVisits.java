package components;

import DTO.ListDTO;
import DTO.RowDTO;
import utility.Initialize;

public class ListByVisits implements MyList {
	Initialize init = new Initialize();
	RowDTO list[];

	public ListDTO[] getList(String filter,int number) {
		list = init.readDataLineByLine("data.csv");
		
		return null;
	}

}
