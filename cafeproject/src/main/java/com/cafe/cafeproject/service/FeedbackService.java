package com.cafe.cafeproject.service;

import java.util.List;

import com.cafe.cafeproject.model.Feedback;
import com.cafe.cafeproject.model.Registration;

public interface FeedbackService {
	Feedback insertrecord(Feedback r);
	List<Feedback> getAll();
	void del(int ri);
	Feedback updaterecord(int i,Feedback r);


}
