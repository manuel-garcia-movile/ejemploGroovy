package com.ejemploGroovy.ejemploGroovy

import com.ejemploGroovy.ejemploGroovy.service.HelloWorldService

//import org.spockframeworservice.HelloWorldService
import spock.lang.Specification
import spock.mock.DetachedMockFactory

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

/**
 * Integration tests for ensuring compatibility with Spring-Boot's {@link WebMvcTest} annotation.
 */
//tag::include[]
@WebMvcTest
class WebMvcTestIntegrationSpec extends Specification {

    @Autowired
    MockMvc mvc

    @Autowired
    HelloWorldService helloWorldService

    def "spring context loads for web mvc slice"() {
        given: "mensaje hello world"
        helloWorldService.getHelloMessage() >> 'hello world'

        expect: "controller is available"
        mvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello world"))
    }

    @TestConfiguration
    static class MockConfig {
        def detachedMockFactory = new DetachedMockFactory()

        @Bean
        HelloWorldService helloWorldService() {
            return detachedMockFactory.Stub(HelloWorldService)
        }
    }
}

