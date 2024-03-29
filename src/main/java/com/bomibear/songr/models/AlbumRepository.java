package com.bomibear.songr.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
    public Album findById(long id);
}
