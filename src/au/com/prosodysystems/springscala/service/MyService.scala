package au.com.prosodysystems.springscala.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import au.com.prosodysystems.springscala.SpringApplication
import com.twitter.logging.Logger

@Component
class MyService {
  	private val log = Logger(getClass)
  	
	@Autowired
	var otherService:MyOtherService = null
	
	def doStuff {
		log.info("Doing stuff")
		otherService.doStuff
		
		log.debug(SpringApplication.ctx.getBean("beanService").toString)
	}
}