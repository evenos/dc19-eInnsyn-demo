package com.example.demo.domain.graf;

import com.microsoft.spring.data.gremlin.repository.GremlinRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkGraphRepository extends GremlinRepository<NetworkGraph, String> {
}
