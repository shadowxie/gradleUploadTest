class HelloSpock extends spock.lang.Specification {
	def "test hello string"() {
		expect:
		name.size() == length

		where:
		name	| length
		"Spock" | 5
		"John"	| 4
	}
}
