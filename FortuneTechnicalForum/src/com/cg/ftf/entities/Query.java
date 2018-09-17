package com.cg.ftf.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="query_master")
public class Query 
{
	@Id
	@NotNull(message="Query ID is mandatory.")
	@Column(name="query_id")
	private Integer queryId;
	
	@Column(name="technology")
	private String technology;
	
	@Column(name="query_raised_by")
	private String queryRaisedBy;
	
	@Column(name="query")
	private String query;

	public Integer getQueryId() {
		return queryId;
	}

	public void setQueryId(Integer queryId) {
		this.queryId = queryId;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getQueryRaisedBy() {
		return queryRaisedBy;
	}

	public void setQueryRaisedBy(String queryRaisedBy) {
		this.queryRaisedBy = queryRaisedBy;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}
	
	
}
