package com.lxt.chenjia.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxt.chenjia.base.bean.web.Packages;
import com.lxt.chenjia.base.exception.ServiceException;
import com.lxt.chenjia.base.utils.CacheUtils;
import com.lxt.chenjia.base.utils.CaptchaUtils;
import com.lxt.chenjia.base.utils.SecurityUtils;
import com.lxt.chenjia.manage.mapper.UserMapper;
import com.lxt.chenjia.manage.mapper.UserSettingMapper;
import com.lxt.chenjia.manage.model.User;
import com.lxt.chenjia.manage.model.UserExample;
import com.lxt.chenjia.manage.model.UserExample.Criteria;
import com.lxt.chenjia.manage.model.UserSetting;
import com.lxt.chenjia.manage.service.api.LoginService;
import com.lxt.chenjia.manage.service.bo.LoginBO;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserSettingMapper userSettingMapper;

	@Override
	public Packages captcha() throws ServiceException {
		return new Packages(CaptchaUtils.getCaptcha());
	}

	@Override
	public Packages login(String username, String password, String captcha,
			String captchaToken) throws ServiceException {
		Packages pkg = new Packages();

		if (captcha.equalsIgnoreCase((String) CacheUtils.get(captchaToken))) {
			UserExample example = new UserExample();
			Criteria criteria = example.createCriteria();
			criteria.andUsernameEqualTo(username);
			criteria.andPasswordEqualTo(SecurityUtils.md5Encrypt(password));
			List<User> list = userMapper.selectByExample(example);

			if (list.size() == 1) {
				LoginBO loginBO = new LoginBO();
				User user = list.get(0);
				user.setPassword(null);
				loginBO.setUser(user);
				UserSetting userSetting = userSettingMapper
						.selectByPrimaryKey(user.getUserId());
				loginBO.setUserSetting(userSetting);
				pkg.getBody().setData(loginBO);
			}else{
				pkg.getHead().setStatus(500);
				pkg.getHead().setMsg("用户名或密码错误！");
			}
		} else {
			pkg.getHead().setStatus(500);
			pkg.getHead().setMsg("验证码输入错误！");
		}

		return pkg;
	}
}
