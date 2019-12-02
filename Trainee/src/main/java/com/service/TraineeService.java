package com.service;

import java.util.ArrayList;

import com.model.Trainee;

public interface TraineeService {
	public Trainee register(Trainee trainee);
	public int login(Trainee trainee);
	int addTrainee(Trainee trainee);
    int updateTrainee(Trainee trainee);
	int deleteTrainee(int tId);
	ArrayList<Trainee> getAll();
	Trainee getByTid(int tId);
}
