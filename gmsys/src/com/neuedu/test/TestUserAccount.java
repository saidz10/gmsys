package com.neuedu.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.neuedu.mapper.UserAccountMapper;
import com.neuedu.model.UserAccount;


@RunWith(SpringJUnit4ClassRunner.class)  //ʹ��junit 4���в���
@ContextConfiguration("classpath:config/spring-common.xml")//Spring����JUnit4����ʱ��ʹ��ע�����������ļ�
public class TestUserAccount {	
	@Autowired
	UserAccountMapper UserAccountMapper;
	
	@Transactional
	@Test
	public void testFindUserByAccount() {
		UserAccount userAccount = UserAccountMapper.findUserByAccount("admin");
		System.out.println(userAccount.getUsername());
	}

}