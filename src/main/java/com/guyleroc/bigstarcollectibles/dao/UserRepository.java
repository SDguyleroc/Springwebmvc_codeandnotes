package com.guyleroc.bigstarcollectibles.dao;

import com.guyleroc.bigstarcollectibles.bean.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
