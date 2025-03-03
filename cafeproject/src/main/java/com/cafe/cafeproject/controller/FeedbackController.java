package com.cafe.cafeproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cafe.cafeproject.model.Feedback;
import com.cafe.cafeproject.service.FeedbackService;

@RestController
public class FeedbackController {
	
	@Autowired
	private FeedbackService fs;
	
	@GetMapping("/Feedbacks")
	public List<Feedback> handleget()
	{
		return fs.getAll();
	}
	@PostMapping("/addfeed")
	public Feedback add(@RequestBody Feedback r)
	{
		return fs.insertrecord(r);
	}
	@DeleteMapping("/delfeed/{rid}")
	public void delr(@PathVariable("rid")int r)
	{
		fs.del(r);
		
	}
	@PutMapping("/upreg/{rid}")
	public Feedback update(@PathVariable("rid")int i,@RequestBody Feedback r)
	{
		return fs.updaterecord(i,r);
	}

	
}
