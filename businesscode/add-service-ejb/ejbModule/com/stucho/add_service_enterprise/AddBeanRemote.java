package com.stucho.add_service_enterprise;

import javax.ejb.Remote;

@Remote
public interface AddBeanRemote {

	
	public int add(int num1, int num2);
}
