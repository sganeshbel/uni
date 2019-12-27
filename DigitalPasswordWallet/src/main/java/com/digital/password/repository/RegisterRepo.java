package com.digital.password.repository;

import com.digital.password.entity.RegisterBean;

public interface RegisterRepo {
	public void registerMethod(RegisterBean register);


	public Long getUser(String email);
}
