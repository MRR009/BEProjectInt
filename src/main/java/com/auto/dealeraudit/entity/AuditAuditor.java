package com.auto.dealeraudit.entity;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import com.fasterxml.jackson.annotation.JsonBackReference;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "auditAuditor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuditAuditor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "auditAuditorId", nullable = false)
	private int auditAuditorId;
	
	//@NotEmpty(message = "Work Allocation Required")
	//@Size(max = 100,min = 0,message = "Work Allocation Should be 0% to 100%")
	@Column(name = "workAllocation", nullable = false )
	private float workAllocation;
	
	@NotNull(message = "Audit Details Required")
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "auditId",referencedColumnName = "auditId",nullable = false)
	@JsonBackReference(value = "auditTOJunctionTable")
	private Audit audit;
	
	@NotNull(message = "Auditor Details Required")
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "auditorId",referencedColumnName = "auditorId",nullable = false)
	@JsonBackReference(value = "auditorTOJunctionTable")
	private Auditor auditor;

	
}
