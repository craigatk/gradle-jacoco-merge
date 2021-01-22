package example

import spock.lang.Specification

class ExampleIntegrationSpec extends Specification {
    def "first foo should be A"() {
        expect:
        new Example().foo(true) == "A"
    }

    def "second foo should be B"() {
        expect:
        new Example().foo(false) == "B"
    }

    def "first baz should be E"() {
        expect:
        new Example().baz(true) == "E"
    }
}
