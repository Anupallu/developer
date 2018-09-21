package com.skemty.Service;

import java.util.List;
import java.util.UUID;




import com.skemty.entity.AdminDetail;
import com.skemty.entity.Student;
import com.skemty.entity.User;
import com.skemty.entity.WrkDetail;


/**
 * @author s6
 *
 */
/**
 * @author s6
 *
 */
public interface UserManager {

	public User getUser();


	// ************************************************************************


	public User getUser(String username);


	public void saveDeatil(WrkDetail wrk, AdminDetail admin);


	public void saveDeatilMapping(Student std);

}
