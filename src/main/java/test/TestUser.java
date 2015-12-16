package test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qapp.Services.UserService;
import com.qapp.dao.generated.UserMapper;
import com.qapp.model.generated.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:Qapp-context.xml" })
public class TestUser {

	@Autowired
	UserService userService;
	
	@Autowired
	UserMapper userMapper;

	@Test
	public void getdtetail() {

		//String name = userService.getName(1L);
		User user = new User();
		user.setContact(917738095223l);
		user.setInstanceId("INST77380ANCEID");
		user.setDeviceImei(12345l);
		user.setFirstName("Pankaj");
		user.setLastName("Solanki");
		user.setUserStatusId(1);
		user.setCreationTime(new Date());
		//int result = userMapper.insert(user);
		//System.out.println(user.getId());

		user.setId(10l);
		user.setFirstName("Priyanka");
		userMapper.updateByPrimaryKey(user);

	}

}
