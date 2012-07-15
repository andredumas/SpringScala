package au.com.prosodysystems.springscala

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.stereotype.Component

import com.twitter.logging.Logger

import au.com.prosodysystems.springscala.config.ApplicationConfiguration
import au.com.prosodysystems.springscala.service.MyService

object SpringApplication extends App {
	private val log = Logger(getClass)
	val ctx = new AnnotationConfigApplicationContext()
 
  	ctx.register(classOf[ApplicationConfiguration])
	ctx.scan("au.com.prosodysystems")
	ctx.refresh
	val myService = ctx.getBean(classOf[MyService])
	myService.doStuff;
}