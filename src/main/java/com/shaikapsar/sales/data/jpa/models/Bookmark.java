package com.shaikapsar.sales.data.jpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Bookmark {
	
	@Id
    @GeneratedValue
    private Long id;
	
	public String uri;
	
    public String description;
    
    @JsonIgnore
    @ManyToOne
    private Account account;

	public Bookmark() {}

	public Bookmark(Account account, String uri, String description) {
		super();
		this.account = account;
		this.uri = uri;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public String getUri() {
		return uri;
	}

	public String getDescription() {
		return description;
	}

	public Account getAccount() {
		return account;
	}

}
