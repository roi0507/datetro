package com.datetro.backendapi.dao;

import com.datetro.models.Matcher;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MatchersRepository extends CrudRepository<Matcher, Integer> {

    public List<Matcher> findByName(String name);
}
