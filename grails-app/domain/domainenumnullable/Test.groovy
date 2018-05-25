package domainenumnullable

class Test {

    String name
    Status status

    static constraints = {
        status nullable: true
    }
}
