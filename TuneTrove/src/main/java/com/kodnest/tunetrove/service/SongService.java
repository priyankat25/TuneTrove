package com.kodnest.tunetrove.service;

import java.util.List;

import com.kodnest.tunetrove.entity.Song;

public interface SongService {

	public void addSong(Song song);

	public boolean songExists(String name);

	public List<Song> fetchAllSongs();

	public void updateSong(Song s);

}