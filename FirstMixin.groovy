class First {     
    String hello(String name) { "Hello $name!" } 
}  

@Mixin(First) 
class Second {
    //empty class
}  

assert new Second().hello('John Snow') == 'Hello John Snow!'