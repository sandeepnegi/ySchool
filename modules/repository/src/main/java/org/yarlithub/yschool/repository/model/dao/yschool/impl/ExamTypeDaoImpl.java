package org.yarlithub.yschool.repository.model.dao.yschool.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import org.yarlithub.yschool.repository.model.obj.yschool.ExamType;
import org.springframework.stereotype.Repository;
import org.yarlithub.yschool.repository.model.dao.yschool.ExamTypeDao;
 
 
/**
 * DAO for table: ExamType.
 * @author autogenerated
 */
@Repository
public class ExamTypeDaoImpl extends GenericHibernateDaoImpl<ExamType, Integer> implements ExamTypeDao {
	
	/** Constructor method. */
		public ExamTypeDaoImpl() {
			super(ExamType.class);
		}
	}

