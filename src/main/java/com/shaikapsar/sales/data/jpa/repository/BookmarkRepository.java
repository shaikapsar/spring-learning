package com.shaikapsar.sales.data.jpa.repository;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shaikapsar.sales.data.jpa.models.Bookmark;

@Transactional
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
	
    Collection<Bookmark> findByAccountUsername(String username);
    
}