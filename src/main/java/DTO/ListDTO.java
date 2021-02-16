package DTO;

public class ListDTO {
	private String classification;
	public ListDTO(String classification, String[] urls) {
		super();
		this.classification = classification;
		this.urls = urls;
	}

	private String[] urls;

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String[] getUrls() {
		return urls;
	}

	public void setUrls(String[] urls) {
		this.urls = urls;
	}

}
