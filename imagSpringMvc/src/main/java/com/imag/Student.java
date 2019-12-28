package com.imag;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="studentMaster")
public class Student {
	@Id
	@GenericGenerator(name="my",strategy="increment")
	@GeneratedValue(generator="my")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="imag")
	private byte[] imag;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the imag
	 */
	public byte[] getImag() {
		return imag;
	}
	/**
	 * @param imag the imag to set
	 */
	public void setImag(byte[] imag) {
		this.imag = imag;
	}
	

}
