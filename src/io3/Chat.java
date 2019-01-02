package io3;

import java.io.Serializable;

public class Chat implements Serializable{
	transient private String id;
	private String name;
	private String msg;
	
	public Chat() {
		
	}
	public Chat(String id, String name, String msg) {
		super();
		this.id = id;
		this.name = name;
		this.msg = msg;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Chat [id=" + id + ", name=" + name + ", msg=" + msg + "]";
	}
	
	
	
}
