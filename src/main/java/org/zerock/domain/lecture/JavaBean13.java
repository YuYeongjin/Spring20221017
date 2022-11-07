package org.zerock.domain.lecture;

import java.util.List;

import lombok.Data;

@Data
public class JavaBean13 { // category

	private int id;
	private String name;
	
	private List<JavaBean14> product;
}
