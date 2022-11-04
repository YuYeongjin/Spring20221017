package org.zerock.domain.lecture;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
public class JavaBean19 {
	private String name;
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private LocalDate date;
	private LocalDateTime dateTime;

}
