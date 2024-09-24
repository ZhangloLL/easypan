package com.easypan.entity.query;

import java.util.Date;


/**
 * 参数
 */
public class UserInfoQuery extends BaseParam {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private String createTime;

	private String createTimeStart;

	private String createTimeEnd;

	/**
	 * 
	 */
	private Integer age;

	/**
	 * 
	 */
	private String code;

	private String codeFuzzy;

	/**
	 * 
	 */
	private String email;

	private String emailFuzzy;

	/**
	 * 
	 */
	private Integer status;

	/**
	 * 
	 */
	private String code02;

	private String code02Fuzzy;

	/**
	 * 
	 */
	private String code03;

	private String code03Fuzzy;

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

	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	public String getCreateTime(){
		return this.createTime;
	}

	public void setCreateTimeStart(String createTimeStart){
		this.createTimeStart = createTimeStart;
	}

	public String getCreateTimeStart(){
		return this.createTimeStart;
	}
	public void setCreateTimeEnd(String createTimeEnd){
		this.createTimeEnd = createTimeEnd;
	}

	public String getCreateTimeEnd(){
		return this.createTimeEnd;
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

	public void setCodeFuzzy(String codeFuzzy){
		this.codeFuzzy = codeFuzzy;
	}

	public String getCodeFuzzy(){
		return this.codeFuzzy;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return this.email;
	}

	public void setEmailFuzzy(String emailFuzzy){
		this.emailFuzzy = emailFuzzy;
	}

	public String getEmailFuzzy(){
		return this.emailFuzzy;
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

	public void setCode02Fuzzy(String code02Fuzzy){
		this.code02Fuzzy = code02Fuzzy;
	}

	public String getCode02Fuzzy(){
		return this.code02Fuzzy;
	}

	public void setCode03(String code03){
		this.code03 = code03;
	}

	public String getCode03(){
		return this.code03;
	}

	public void setCode03Fuzzy(String code03Fuzzy){
		this.code03Fuzzy = code03Fuzzy;
	}

	public String getCode03Fuzzy(){
		return this.code03Fuzzy;
	}

	public void setTest(Long test){
		this.test = test;
	}

	public Long getTest(){
		return this.test;
	}

}
