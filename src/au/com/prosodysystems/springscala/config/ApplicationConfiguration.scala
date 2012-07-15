package au.com.prosodysystems.springscala.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import com.twitter.logging.Logger
import com.twitter.logging.LoggerFactory

@Configuration
class ApplicationConfiguration {
	Logger.reset
//	Logger.clearHandlers
//	new LoggerFactory(handlers = new ConsoleHandler())
	
	private val log = Logger(getClass)
  
	@Bean
	def beanService = {
		log.info("Making random object")
		new Object()
	}
  
}