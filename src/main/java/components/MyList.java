package components;

import DTO.ListDTO;

public interface MyList {

	public String[] getList();
	public ListDTO getListByRange(String cat);
}
