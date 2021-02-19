package utility;

import java.io.FileReader;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

import com.opencsv.CSVReader;

import DTO.RowDTO;

public class Initialize {
	static RowDTO list[];
	static int counter = 0;

	public RowDTO[] readDataLineByLine(String file) {

		try {
			FileReader filereader = new FileReader(file);
			CSVReader csvReader = new CSVReader(filereader);
			String[] nextRecord;
			list = new RowDTO[1000];
			nextRecord = csvReader.readNext();
			while (counter < 1000 && (nextRecord = csvReader.readNext()) != null) {
				try {
					list[counter++] = new RowDTO(nextRecord[0], nextRecord[2] + nextRecord[11],
							Integer.parseInt(nextRecord[8]), LocalDate.parse(nextRecord[3]));
				} catch (NumberFormatException e) {
//					System.out.println("String found in Numeric");
				}
			}
//			System.out.println(Arrays.toString(list));

//			Arrays.sort(list);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(list));
		return list;
	}
}
