package com.dio.ingrid.service;

import com.dio.ingrid.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
