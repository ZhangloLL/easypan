package com.easypan.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.easypan.entity.enums.DateTimePatternEnum;
import com.easypan.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 
 */
public class UserInfo implements Serializable {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 
	 */
	private Integer age;

	/**
	 * 
	 */
	private String code;

	/**
	 * 
	 */
	private String email;

	/**
	 * 
	 */
	private Integer status;

	/**
	 * 
	 */
	private String code02;

	/**
	 * 
	 */
	private String code03;

	/**
	 * 
	 */
	private Long test;


	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	public void setAge(Integer age){
		this.age = age;
	}

	public Integer getAge(){
		return this.age;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return this.code;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return this.email;
	}

	public void setStatus(Integer status){
		this.status = status;
	}

	public Integer getStatus(){
		return this.status;
	}

	public void setCode02(String code02){
		this.code02 = code02;
	}

	public String getCode02(){
		return this.code02;
	}

	public void setCode03(String code03){
		this.code03 = code03;
	}

	public String getCode03(){
		return this.code03;
	}

	public void setTest(Long test){
		this.test = test;
	}

	public Long getTest(){
		return this.test;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，createTime:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，age:"+(age == null ? "空" : age)+"，code:"+(code == null ? "空" : code)+"，email:"+(email == null ? "空" : email)+"，status:"+(status == null ? "空" : status)+"，code02:"+(code02 == null ? "空" : code02)+"，code03:"+(code03 == null ? "空" : code03)+"，test:"+(test == null ? "空" : test);
	}
}
