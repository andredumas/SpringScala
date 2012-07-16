package au.com.prosodysystems.springscala.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import com.twitter.logging.Logger

@Configuration
class ApplicationConfiguration {
	Logger.reset
  
//	Logger.configure(
//	    List(new LoggerFactory(handlers = List(new ConsoleHandler(level = Option[Logger.DEBUG]))))
//	    List(new LoggerFactory(handlers = List(new ConsoleHandler(new Formatter(), Some(Logger.DEBUG)))))
//	    List(new LoggerFactory(handlers = List(new ConsoleHandler())))
//	)
	
	private val log = Logger(getClass)
  
	@Bean
	def beanService = {
		log.info("Making random object")
		new Object()
	}
  
}