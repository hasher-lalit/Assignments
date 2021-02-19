package components;

import java.util.List;

import DTO.ListDTO;

public interface MyList {

	public List<ListDTO> getList(String filter,int number);
}
