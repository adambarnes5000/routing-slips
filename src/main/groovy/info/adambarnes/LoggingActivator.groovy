package info.adambarnes

import org.springframework.stereotype.Component

import groovy.util.logging.Slf4j

@Slf4j
@Component
class LoggingActivator {

  Object log(Object obj){
    log.info("Received " + obj)
    "Thanks!"
  }
}
