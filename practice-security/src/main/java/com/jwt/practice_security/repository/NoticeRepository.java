package com.jwt.practice_security.repository;

import com.jwt.practice_security.model.Notice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeRepository extends CrudRepository<Notice, Long> {
	
	@Query(value = "FROM Notice n WHERE CURRENT_DATE BETWEEN noticBegDt AND noticEndDt")
	List<Notice> findAllActiveNotices();

}
