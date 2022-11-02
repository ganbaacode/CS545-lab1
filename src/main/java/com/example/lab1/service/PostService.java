package com.example.lab1.service;

import com.example.lab1.entity.Post;

import java.util.List;

public interface PostService {

    public List<Post> findAll();

    public Post getById(int id);

    public void save(Post p);

    public void delete(int id);

    public void update(int id,Post p);
}
