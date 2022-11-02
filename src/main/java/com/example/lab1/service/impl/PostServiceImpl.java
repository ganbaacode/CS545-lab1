package com.example.lab1.service.impl;

import com.example.lab1.entity.Post;
import com.example.lab1.repo.PostRepo;
import com.example.lab1.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepo postRepo;


    @Override
    public List<Post> findAll() {
        return postRepo.findAll();
    }

    @Override
    public Post getById(int id) {
        return postRepo.getById(id);
    }

    @Override
    public void save(Post p) {
        postRepo.save(p);
    }

    @Override
    public void delete(int id) {
        postRepo.delete(id);
    }

    @Override
    public void update(int id, Post p) {
        postRepo.update(id,p);
    }
}
