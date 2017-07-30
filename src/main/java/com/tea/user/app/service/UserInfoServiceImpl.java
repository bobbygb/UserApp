package com.tea.user.app.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.dubbo.config.annotation.Service;
import com.tea.user.entity.User;
import com.tea.user.service.IUserInfoService;

@Service
public class UserInfoServiceImpl implements IUserInfoService{

	@Override
	public List<User> getUsers(String phone) {
		List<User> list = new ArrayList<User>();
		User u1 = new User();
		u1.setId(2000);
		u1.setName("li xiao hai");
		u1.setPwd("111");
		u1.setPhone("15017934827");
		
		User u2 = new User();
		u2.setId(3000);
		u2.setName("li xiao long");
		u2.setPwd("111");
		u2.setPhone("15017934828");
		
		User u3 = new User();
		u3.setId(4000);
		u3.setName("秦芳芳");
		u3.setPwd("111");
		u3.setPhone("13510737324");
		
		if(StringUtils.isNotBlank(phone)){
			if(StringUtils.equals(u1.getName(), phone)){
				list.add(u1);
			}
			if(StringUtils.equals(u2.getName(), phone)){
				list.add(u2);
			}
			if(StringUtils.equals(u3.getName(), phone)){
				list.add(u3);
			}
		}else{
			list.add(u1);
			list.add(u2);
			list.add(u3);
		}
		
		return list;
	}

	@Override
	public User getUserById(long id) {
		User u1 = new User();
		u1.setId(2000);
		u1.setName("li xiao hai");
		u1.setPwd("111");
		u1.setPhone("15017934827");
		
		return u1;
	}

	@Override
	public boolean addUser(User user) {
		
		return true;
	}

}
