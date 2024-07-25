package com.kodnest.tunetrove.service;

import java.util.List;

import com.kodnest.tunetrove.entity.Playlist;

public interface PlaylistService {

	public void addplaylist(Playlist playlist);

	public List<Playlist> fetchAllPlaylists();
}