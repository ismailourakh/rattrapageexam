package com.example.demo.Controller;


import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraphQLController {

    private final GraphQL graphQL;

    @Autowired
    public GraphQLController(GraphQL graphQL) {
        this.graphQL = graphQL;
    }

    @PostMapping("/graphql")
    public ExecutionResult executeGraphQL(@RequestBody String query) {
        return graphQL.execute(query);
    }
}
