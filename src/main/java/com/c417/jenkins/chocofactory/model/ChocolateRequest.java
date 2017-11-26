package com.c417.jenkins.chocofactory.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.swagger.annotations.ApiModelProperty;

@JsonSerialize
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
public class ChocolateRequest {

	@ApiModelProperty(
			value = "cocoa(unit is gram)",
			required = true,
			allowableValues = "range[1,100]"
			)
	@NotNull
	@Range(min=0, max=100)
	private Integer cacao;
	@ApiModelProperty(
			value = "butter(unit is gram)",
			required = true,
			allowableValues = "range[1,100]"
			)
	@NotNull
	@Range(min=0, max=100)
	private Integer butter;
	@ApiModelProperty(
			value = "cocoaPawder(unit is gram)",
			required = true,
			allowableValues = "range[1,50]"
			)
	@NotNull
	@Range(min=0, max=50)	
	private Integer cocoaPowder;
	@ApiModelProperty(
			value = "milk(unit is gram)",
			required = true,
			allowableValues = "range[1,50]"
			)
	@NotNull
	@Range(min=0, max=50)	
	private Integer milk;
	@ApiModelProperty(
			value = "suger(unit is gram)",
			required = true,
			allowableValues = "range[1,300]"
			)
	@NotNull
	@Range(min=0, max=300)
	private Integer suger;
	
	public Integer getCacao() {
		return cacao;
	}
	public void setCacao(Integer cacao) {
		this.cacao = cacao;
	}
	public Integer getButter() {
		return butter;
	}
	public void setButter(Integer butter) {
		this.butter = butter;
	}
	public Integer getCocoaPowderr() {
		return cocoaPowder;
	}
	public void setCocoaPowder(Integer cocoaPowder) {
		this.cocoaPowder = cocoaPowder;
	}
	public Integer getMilk() {
		return milk;
	}
	public void setMilk(Integer milk) {
		this.milk = milk;
	}
	public Integer getSuger() {
		return suger;
	}
	public void setSuger(Integer suger) {
		this.suger = suger;
	}
	
	
	
}
