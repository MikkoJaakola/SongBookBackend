package com.example.SongBookBackend.web;

import java.util.List;
import java.util.Optional;

import com.example.SongBookBackend.domain.Song;
import com.example.SongBookBackend.domain.SongRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SongController {

	@Autowired
	private SongRepository repository;
	
	// REST service to get all songs
	@RequestMapping(value="/songs", method=RequestMethod.GET)
	public @ResponseBody List<Song> songListRest() {
		return(List<Song>) repository.findAll();
	}
	
	// REST service to get song by id
	@RequestMapping(value="/song/{id}", method = RequestMethod.GET)
    public @ResponseBody Optional<Song> findBookRest(@PathVariable("id") Long songId) {	
    	return repository.findById(songId);
    }  
	
}
