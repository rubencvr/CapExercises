package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Speaker;
import com.example.demo.repositories.SpeakerRepository;

@RestController
@RequestMapping("/api/v1/speaker_rcv")
public class SpeakerController {

	@Autowired
	private SpeakerRepository speakerRepository;
	
	@GetMapping
	public List<Speaker> list(){
		return speakerRepository.findAll();
	}
	
	@SuppressWarnings("deprecation")
	@GetMapping
	@RequestMapping("{id}")
	public Speaker get(@PathVariable Long id) {
		return speakerRepository.getOne(id);
	}
	
	@PostMapping
	public Speaker create(@RequestBody final Speaker speaker){
		return speakerRepository.saveAndFlush(speaker);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		//Also need to check for children records before deleting
		speakerRepository.deleteById(id);
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	public Speaker update(@PathVariable long id, @RequestBody Speaker speaker) {
		//because this is a PUT, we expect all attributes to be passed in. A PATCH would only need what
		//TODO: Add validation that all attributes are passed in, otherwise return a 400 bad payload
		Speaker existingSpeaker = speakerRepository.getOne(id);
		BeanUtils.copyProperties(speaker, existingSpeaker, "speaker_id");
		return speakerRepository.saveAndFlush(existingSpeaker);
	}
}