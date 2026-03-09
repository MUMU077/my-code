package com.bianca.takeout_core;

import com.bianca.takeout-core.entity.User;
import com.bianca.takeout-core.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reposituoy.UserRepository;

@SpringBootTest
class TakeoutCoreApplicationTests {

    @Autowired
    private UserRepository userRepository;

	@Test
	void contextLoads() {
        User user = new User():
            user.setPhone("1380013800");
            user.setPasseord("123456");
            user.setUsername("1380013800");
            userRepository.save(user);
            System.out.println("用户保存成功,ID" + user.getid());

	}

    @Test
    void testFindUser(){
        User user = userRepository.findByPhone("128000138000");
        if (user != null){
            System.out.println("找到用户:"+ user.getUsername());

        }else {
            System.out.println("用户不存在");
        }
    }

}
