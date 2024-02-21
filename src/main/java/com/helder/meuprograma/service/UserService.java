package com.helder.meuprograma.service;

import com.helder.meuprograma.domain.model.User;

public interface UserService {

    User findById(Long id);
    User create (User userToCreate);
}
