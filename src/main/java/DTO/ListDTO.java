package DTO;

import java.util.*;

public class ListDTO {
	private String classification;

	public ListDTO(String classification, List<String> urls) {
		super();
		this.classification = classification;
		this.urls = urls;
	}

	private List<String> urls;

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public List<String> getUrls() {
		return urls;
	}

	public void setUrls(List<String> urls) {
		this.urls = urls;
	}

	@Override
	public String toString() {
		return "classification=" + classification + ", urls=" + urls + "]\n";
	}

}
