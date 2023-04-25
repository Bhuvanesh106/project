package com.subject.SpringBootCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.subject.SpringBootCrud.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject,String> {
	

}
