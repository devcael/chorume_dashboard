package com.chorume_dashboard.repositorys;

import org.springframework.data.repository.CrudRepository;

import com.chorume_dashboard.models.Users;
import org.springframework.stereotype.Repository;

/**
 * UserRepository
 */

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {

}
