package com.investup.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="StartupInvestments")
public class StartupInvestments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="investmentId", unique = true, nullable = false)
	private long investmentId;
	
//	@JoinColumn(name = "startupId", unique = true, nullable = false)
//	private long startupId;
	
//	@JoinColumn(name = "investorId", unique = true, nullable = false)
//	private long investorId;
	
	@Column(name = "amount", nullable = false)
	private long amount;
	
	@Temporal(TemporalType.DATE)
	private Date date ;
	
	@Column(name = "investmentStatus")
	private String investmentStatus;
	
	@ManyToOne
	@JoinColumn(name="startupId")
	private Startup startup;
	
	
	@ManyToOne
	@JoinColumn(name="investorId")
	private Investor investor;

	public StartupInvestments() {
	
	}

	public StartupInvestments(long investorId, long amount, Date date, String investmentStatus) {
		
//		this.startupId = startupId;
//		this.investorId = investorId;
		this.amount = amount;
		this.date = date;
		this.investmentStatus = investmentStatus;
	}

	public long getInvestmentId() {
		return investmentId;
	}

	public void setInvestmentId(long investmentId) {
		this.investmentId = investmentId;
	}

//	public long getStartupId() {
//		return startupId;
//	}
//
//	public void setStartupId(long startupId) {
//		this.startupId = startupId;
//	}

//	public long getInvestorId() {
//		return investorId;
//	}
//
//	public void setInvestorId(long investorId) {
//		this.investorId = investorId;
//	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getInvestmentStatus() {
		return investmentStatus;
	}

	public void setInvestmentStatus(String investmentStatus) {
		this.investmentStatus = investmentStatus;
	}

	
	
	
}
