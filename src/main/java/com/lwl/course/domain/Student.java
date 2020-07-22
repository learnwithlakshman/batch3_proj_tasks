package com.lwl.course.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Student {

	private String name;
	private String batch;
	private String qualification;
	private double score;
	private Status courseStatus;
	private Status placementStatus;

}
