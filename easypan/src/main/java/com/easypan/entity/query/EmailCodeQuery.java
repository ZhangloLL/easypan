package com.easypan.entity.query;



/**
 * 邮箱验证码参数
 */
public class EmailCodeQuery extends BaseParam {


	/**
	 * 邮箱
	 */
	private String email;

	private String emailFuzzy;

	/**
	 * 编号
	 */
	private String code;

	private String codeFuzzy;


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

}
