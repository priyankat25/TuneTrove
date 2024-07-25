package com.kodnest.tunetrove.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodnest.tunetrove.entity.Playlist;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {

}