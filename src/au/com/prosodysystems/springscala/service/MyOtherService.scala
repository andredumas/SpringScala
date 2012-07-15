package au.com.prosodysystems.springscala.service

import org.springframework.stereotype.Component
import org.springframework.stereotype.Component
import scala.util.logging.Logged
import org.apache.commons.logging.LogFactory
import com.twitter.logging.Logger

@Component
class MyOtherService {
  	private val log = Logger(getClass)
  	
	def doStuff = {
	  log.debug("Doing some other stuff")
	}
}