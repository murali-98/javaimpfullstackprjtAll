package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emptab")
public class Employee {
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Id
		@Column(name = "eid")
		private Integer empId;
		
		@Column(name = "ename")
		private String empName;
		
		@Column(name = "edept")
		private String empdept;
		
		@Column(name = "esal")
		private double empSal;

		public Employee(String empName, String empdept, double empSal) {
			super();
			this.empName = empName;
			this.empdept = empdept;
			this.empSal = empSal;
		}
		
		
}
