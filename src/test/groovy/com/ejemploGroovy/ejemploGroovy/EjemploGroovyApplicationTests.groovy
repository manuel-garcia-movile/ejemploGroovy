package com.ejemploGroovy.ejemploGroovy

/*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
*/

import spock.lang.Specification

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

//@RunWith(SpringRunner)
//@SpringBootTest
@SpringBootTest(classes = EjemploGroovyApplication)
class EjemploGroovyApplicationTests extends Specification{

	@Autowired
	ApplicationContext context

	def "Test context loads"() {
		expect:
		context != null
		//context.containsBean("helloWorldService")
		context.containsBean("ejemploGroovyApplication")
		//context.containsBean("scopedHelloWorldService")
	}


}
