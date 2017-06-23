package org.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table (name="SER", uniqueConstraints=@UniqueConstraint(columnNames = { "SERNO" }))
public class Ser {

	@Id
	@GeneratedValue
	private long serid;
	
	@Column (name = "SYSTEM")
	private String sysCode;
	
	private String serDetail;
	
	private String serNo;

	public long getSerid() {
		return serid;
	}

	public void setSerid(long serid) {
		this.serid = serid;
	}

	public String getSysCode() {
		return sysCode;
	}

	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}

	public String getSerDetail() {
		return serDetail;
	}

	public void setSerDetail(String serDetail) {
		this.serDetail = serDetail;
	}

	public String getSerNo() {
		return serNo;
	}

	public void setSerNo(String serNo) {
		this.serNo = serNo;
	}
	
	
}
