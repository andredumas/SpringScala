package au.com.prosodysystems.springscala.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

import com.twitter.logging.Logger

import au.com.prosodysystems.springscala.SpringApplication

@Component
class MyService {
  	private val log = Logger(getClass)
  	
	@Autowired
	var otherService:MyOtherService = null
	
	val anotherService:MyOtherService = SpringApplication.ctx.getBean(classOf[MyOtherService])
	
	def doStuff {
		log.info("Doing stuff")
		otherService.doStuff
		
		log.debug(SpringApplication.ctx.getBean("beanService").toString)
		
		log.info("More Stuff")
		anotherService.doStuff
	}
}