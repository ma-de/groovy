trait Name {
    abstract String name()
    String myNameIs() { "My name is ${name()}!" }
}
trait Age {
    int age() { 42 }
}

trait Location {
	String myLocationIs() { "My location is ${location()}"}
}

class Person implements Name, Age, Location {
    String name() { 'Vahid' }
    String location() { 'London' }
}

def p = new Person()
assert p.myNameIs() == 'My name is Vahid!'
assert p.age() == 42
assert p.myLocationIs() == 'My location is London'
assert p instanceof Name
assert p instanceof Age
assert p instanceof Location