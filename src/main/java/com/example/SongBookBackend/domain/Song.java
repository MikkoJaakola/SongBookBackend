package com.example.SongBookBackend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	private String title, lyrics;
	
	
	public Song() {
		
	}
	
	public Song(String title, String lyrics) {
		super();
		this.title = title;
		this.lyrics = lyrics;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		this.Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	@Override
	public String toString() {
		return "Song [id=" + Id + ", title=" + title + ", lyrics=" + lyrics + "]";
	}
	
	
	
}
