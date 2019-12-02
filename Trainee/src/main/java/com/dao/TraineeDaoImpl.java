package com.dao;

import java.util.ArrayList;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.model.Trainee;

@Component("dao")
@Repository
@ComponentScan("com")
public class TraineeDaoImpl implements TraineeDao{

	@PersistenceContext
	EntityManager entityManager;
	
	public Trainee register(Trainee trainee) {
		entityManager.persist(trainee);
		return trainee;
	}

	
	public int login(Trainee trainee) {
		int id=0;
		 trainee=entityManager.find(Trainee.class,trainee.getId());
		return id;
	}
	@Override
	public int addTrainee(Trainee trainee) {
		entityManager.persist(trainee);
		return 0;
	}

	@Override
	public int updateTrainee(Trainee trainee) {
		entityManager.merge(trainee);
		return 0;
	}

	@Override
	public int deleteTrainee(int tId) {
		Trainee trainee =new Trainee();
		trainee.setId(tId);
		entityManager.remove(entityManager.contains(trainee) ? trainee : entityManager.merge(trainee));
		return 0;
	}

	@Override
	public ArrayList<Trainee> getAll() {
		Query query = (Query) entityManager.createQuery("from Trainee ");
		ArrayList<Trainee> list = (ArrayList<Trainee>) query.list();
		return list;
	}

	@Override
	public Trainee getByTid(int tId) {
		Trainee trainee = entityManager.find(Trainee.class,tId);
		return trainee;
	}

}
