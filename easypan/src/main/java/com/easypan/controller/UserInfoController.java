package com.easypan.controller;

import java.util.List;

import com.easypan.entity.query.UserInfoQuery;
import com.easypan.entity.po.UserInfo;
import com.easypan.entity.vo.ResponseVO;
import com.easypan.service.UserInfoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  Controller
 */
@RestController("userInfoController")
@RequestMapping("/userInfo")
public class UserInfoController extends ABaseController{

	@Resource
	private UserInfoService userInfoService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(UserInfoQuery query){
		return getSuccessResponseVO(userInfoService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(UserInfo bean) {
		userInfoService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<UserInfo> listBean) {
		userInfoService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<UserInfo> listBean) {
		userInfoService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id查询对象
	 */
	@RequestMapping("/getUserInfoById")
	public ResponseVO getUserInfoById(Integer id) {
		return getSuccessResponseVO(userInfoService.getUserInfoById(id));
	}

	/**
	 * 根据Id修改对象
	 */
	@RequestMapping("/updateUserInfoById")
	public ResponseVO updateUserInfoById(UserInfo bean,Integer id) {
		userInfoService.updateUserInfoById(bean,id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id删除
	 */
	@RequestMapping("/deleteUserInfoById")
	public ResponseVO deleteUserInfoById(Integer id) {
		userInfoService.deleteUserInfoById(id);
		return getSuccessResponseVO(null);
	}
}