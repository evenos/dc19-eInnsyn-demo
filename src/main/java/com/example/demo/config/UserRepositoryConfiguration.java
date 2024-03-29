package com.example.demo.config;

import com.microsoft.spring.data.gremlin.common.GremlinConfig;
import com.microsoft.spring.data.gremlin.config.AbstractGremlinConfiguration;
import com.microsoft.spring.data.gremlin.repository.config.EnableGremlinRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableGremlinRepositories("com.example.demo.domain.graf")
@EnableConfigurationProperties(GremlinProperties.class)
public class UserRepositoryConfiguration extends AbstractGremlinConfiguration {

    @Autowired
    private GremlinProperties gremlinProps;

    @Override
    public GremlinConfig getGremlinConfig() {
        return new GremlinConfig(
                gremlinProps.getEndpoint(),
                gremlinProps.getPort(),
                gremlinProps.getUsername(),
                gremlinProps.getPassword(),
                gremlinProps.isSslEnabled(),
                gremlinProps.isTelemetryAllowed(),
                gremlinProps.getSerializer());
    }
}
