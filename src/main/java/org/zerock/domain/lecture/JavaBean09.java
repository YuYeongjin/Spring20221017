package org.zerock.domain.lecture;

import lombok.Data;

@Data
public class JavaBean09 {
	private int id;
	private String name;
	private double price;
	private JavaBean10 supplier;
}
