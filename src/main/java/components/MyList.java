package components;

import DTO.ListDTO;

public interface MyList {

	public ListDTO[] getList(String filter,int number);
}
