package com.springboot.SpringDataJPA.entity;

/*
 * 
 *      In my table If we want that a column will be unique for every user we defined UNIQUECONSTRAINT
 *      
 *    uniqueConstraints = @UniqueConstraint(
		name = "emailId_unqiue",
		columnNames="email_address")
		
 *          
 *          Also as we have added it as unique , we want this email from user every-time.
 *          so,
 *          we make email as nullable = false .
 *          
 *          
 * 
 */
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="tbl_student",
uniqueConstraints = @UniqueConstraint(
		name = "emailId_unqiue",
		columnNames="email_address")
)
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator="student_seq")
	@SequenceGenerator(name="student_seq",allocationSize = 1)
	private Long studentId;
	@Column(name="email_address",nullable = false)
	private String emailId;
	private String firstName;
	private String guardianEmail;
	private String guardianMobile;
	private String guardianName;
}
