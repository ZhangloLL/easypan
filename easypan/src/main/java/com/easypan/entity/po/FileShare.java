package com.easypan.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.easypan.entity.enums.DateTimePatternEnum;
import com.easypan.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 分享信息
 */
public class FileShare implements Serializable {


	/**
	 * 分享ID
	 */
	private String shareId;

	/**
	 * 文件ID
	 */
	private String fileId;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 有效期类型 0:1天 1:7天 2:30天 3:永久有效
	 */
	private Integer validType;

	/**
	 * 失效时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date expireTime;


	public void setShareId(String shareId){
		this.shareId = shareId;
	}

	public String getShareId(){
		return this.shareId;
	}

	public void setFileId(String fileId){
		this.fileId = fileId;
	}

	public String getFileId(){
		return this.fileId;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return this.userId;
	}

	public void setValidType(Integer validType){
		this.validType = validType;
	}

	public Integer getValidType(){
		return this.validType;
	}

	public void setExpireTime(Date expireTime){
		this.expireTime = expireTime;
	}

	public Date getExpireTime(){
		return this.expireTime;
	}

	@Override
	public String toString (){
		return "分享ID:"+(shareId == null ? "空" : shareId)+"，文件ID:"+(fileId == null ? "空" : fileId)+"，用户ID:"+(userId == null ? "空" : userId)+"，有效期类型 0:1天 1:7天 2:30天 3:永久有效:"+(validType == null ? "空" : validType)+"，失效时间:"+(expireTime == null ? "空" : DateUtil.format(expireTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
