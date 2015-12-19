package test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qapp.model.ServiceResponse;
import com.qapp.model.generated.User;
import com.qapp.model.generated.UserExample;
import com.qapp.service.IService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
public class TestUser {

	@Autowired
	@Qualifier("userService")
	IService<User, UserExample> iService;

	@Test
	public void getdtetail() {

		User user = new User();
		user.setContact(917738095223l);
		user.setInstanceId("INST77380ANCEID");
		user.setDeviceImei(12345l);
		user.setFirstName("Pankaj");
		user.setLastName("Solanki");
		user.setUserStatusId(1);
		user.setCreationTime(new Date());

		ServiceResponse serviceResponse = iService.add(user);
		User u = (User) serviceResponse.getResult();

		System.out.println(user.getId());
		System.out.println(u.getId());

		user.setId(10l);
		user.setFirstName("Priyanka");
		// intf.updateByPrimaryKey(user);

	}

}
