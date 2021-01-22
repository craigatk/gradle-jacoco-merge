package example

import spock.lang.Specification

class ExampleSpec extends Specification {
    def "first foo should be A"() {
        expect:
        new Example().foo(true) == "A"
    }

    def "first bar should be C"() {
        expect:
        new Example().bar(true) == "C"
    }
}
