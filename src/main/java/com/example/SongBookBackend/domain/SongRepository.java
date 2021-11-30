package com.example.SongBookBackend.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface SongRepository extends CrudRepository <Song, Long> {

	List<Song> findbyTitle(String title);
}
