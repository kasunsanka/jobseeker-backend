package com.icbt.appoiment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icbt.appoiment.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User
,Long>{

}
