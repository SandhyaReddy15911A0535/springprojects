package com.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.TraineeDao;
import com.model.Trainee;
@Component("service")
@Service
@Transactional
public class TraineeServiceImpl implements TraineeService{
	@Autowired
	TraineeDao dao;
	public Trainee register(Trainee trainee) {
		return dao.register(trainee);
	}
	public int login(Trainee trainee) {
		return dao.login(trainee);
		
	}
	@Override
	public int addTrainee(Trainee trainee) {
		return dao.addTrainee(trainee);
	}

	@Override
	public int updateTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return dao.updateTrainee(trainee);
	}

	@Override
	public int deleteTrainee(int tId) {
		// TODO Auto-generated method stub
		return dao.deleteTrainee(tId);
	}

	@Override
	public ArrayList<Trainee> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public Trainee getByTid(int tId) {
		// TODO Auto-generated method stub
		return dao.getByTid(tId);
	}

}
