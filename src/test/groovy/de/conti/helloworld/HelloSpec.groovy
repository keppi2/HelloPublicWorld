package de.conti.helloworld

import spock.lang.Specification

class HelloSpec extends Specification {

   def "primitive test"() {
      given:
      Hello classUnderTest = new Hello()
      when:
      String actualString = classUnderTest.sayHello()
      then:
      actualString == "Hello"
   }


}
