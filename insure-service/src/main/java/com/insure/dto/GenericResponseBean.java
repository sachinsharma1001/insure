package com.insure.dto;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenericResponseBean<T> {

	@JsonProperty("status")
	private boolean status;

	@JsonProperty("result")
	private T result;

	@JsonProperty("data")
	private Map<String, List<T>> data;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public Map<String, List<T>> getData() {
		return data;
	}

	public void setData(Map<String, List<T>> data) {
		this.data = data;
	}

}
