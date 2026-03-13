package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cts_emp_info")
@Data // @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@Column(name = "empno")
	@Min(value = 1, message = "Employee Id can not be negative")
	private int empId;
	@NotBlank(message = "Employee Name can not be Empty/blank/null")
	@Column(name = "ename", nullable = false, length = 10)
	@Size(min = 6, max = 155, message = "name length should be 6 -155 characters")
	private String empName;
	@Min(value = 10000, message = "Salary can not be below 10k")
	@Max(value = 100000, message = "Salary can not be more than 100k")
	private int empSal;
	@NotBlank(message = "designation can not be blank")
	private String empDesg;

}