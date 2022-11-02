package ua.mykola.java16;

record Person(String name, int age) {
//    Person(String name, int age) {
//        this.name = name;
//        if(age < 18) {
//            throw new RuntimeException(name + " is so young");
//        }
//        this.age = age;
//    }
        Person {
        if(age < 18) {
            throw new RuntimeException(name + " is so young");
        }
    }
}
