package com.codewitharjun.fullstackbacken.repository;

import com.codewitharjun.fullstackbacken.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
