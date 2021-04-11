package com.example.ServerIf.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServerIf {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private Long userid;
    private String ts;
    private String lat_long;
    private String noun;
    private String verb;
    private String time_spent;
    private String properties;
    
	public ServerIf() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServerIf(Long id, Long userid, String ts, String lat_long, String noun, String verb, String time_spent,
			String properties) {
		super();
		this.id = id;
		this.userid = userid;
		this.ts = ts;
		this.lat_long = lat_long;
		this.noun = noun;
		this.verb = verb;
		this.time_spent = time_spent;
		this.properties = properties;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public String getLat_long() {
		return lat_long;
	}

	public void setLat_long(String lat_long) {
		this.lat_long = lat_long;
	}

	public String getNoun() {
		return noun;
	}

	public void setNoun(String noun) {
		this.noun = noun;
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

	public String getTime_spent() {
		return time_spent;
	}

	public void setTime_spent(String time_spent) {
		this.time_spent = time_spent;
	}

	public String getProperties() {
		return properties;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}
    
    
    

}
