package DTO;

import java.time.LocalDate;

public class RowDTO {
	String uuid;
	String url;
	int value;
	LocalDate date;

	public RowDTO(String uuid, String url, int value, LocalDate date) {
		super();
		this.uuid = uuid;
		this.url = url;
		this.value = value;
		this.date = date;
	}

	@Override
	public String toString() {
		return "RowDTO [uuid=" + uuid + ", url=" + url + ", value=" + value + ", date=" + date + "]";
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
