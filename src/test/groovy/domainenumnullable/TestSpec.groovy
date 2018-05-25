package domainenumnullable

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TestSpec extends Specification implements DomainUnitTest<Test> {

    void 'enums can be nullable'() {
        given:
            def test = new Test(name: 'foo')

        when:
            test.save()

        then:
            !test.hasErrors()
    }

    void 'enum with value'() {
        given:
            def test = new Test(name: 'foo', status: Status.DISABLED)

        when:
            test.save()

        then:
            !test.hasErrors()
    }
}
