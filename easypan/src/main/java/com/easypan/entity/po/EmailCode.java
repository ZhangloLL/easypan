package com.easypan.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 邮箱验证码
 */
public class EmailCode implements Serializable {


	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 编号
	 */
	private String code;


	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return this.email;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return this.code;
	}

	@Override
	public String toString (){
		return "邮箱:"+(email == null ? "空" : email)+"，编号:"+(code == null ? "空" : code);
	}
}
