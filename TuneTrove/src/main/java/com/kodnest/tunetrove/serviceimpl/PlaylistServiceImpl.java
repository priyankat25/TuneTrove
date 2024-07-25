package com.kodnest.tunetrove.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.tunetrove.entity.Playlist;
import com.kodnest.tunetrove.repository.PlaylistRepository;
import com.kodnest.tunetrove.service.PlaylistService;

@Service
public class PlaylistServiceImpl implements PlaylistService {
	
	@Autowired
	PlaylistRepository playlistRepository;

	@Override
	public void addplaylist(Playlist playlist) {
		playlistRepository.save(playlist);
	}

	@Override
	public List<Playlist> fetchAllPlaylists() {
		List<Playlist> allplaylist = playlistRepository.findAll();
		return allplaylist;
	}
}