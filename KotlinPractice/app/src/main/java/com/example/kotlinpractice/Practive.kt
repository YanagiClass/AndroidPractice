package com.example.kotlinpractice

//fun main() {
//    // 1. 익명함수
//    // 2. 변수처럼 사용되서, 함수의 argument, return
//    // 3. 한번 사용되고, 재사용되지 않는 함수
//    val a = fun(){ println("hello") }
//    val c : Int = 10
//    val b : (Int) -> Int = { it * 10 }
//    val d = { i :Int , j : Int -> i * j }
//    val f : (Int, String, Boolean) -> String  = { _, b, _ -> b}
//
//    hello(10, b)
//}
//
//fun hello(a: Int, b: (Int) -> Int) : (Int) -> Int{
//    println(a)
//    println(b(20))
//    return b
//}
//fun main() {
//    //확장함수 Extension function
//    // 기존에 정의되어 있는 클래스에 함수를 추가하는 기능
//    val test = Test()
//    Test().hello()
//    test.hi()
//}
//
//fun Test.hi() = print("하이")
//
//class Test() {
//    fun hello() = println("안녕")
//    fun bye() = println("잘가")
//}
//fun main() {
    //let, run, apply, also  with
    //1. let
    // 수신객체.let { user ->
    //
    // 마지막 줄 // return
    // }
//    val a = 3
//    a.let {  }
//    var user : User? = User("채상아", 10, true)
//    val age = user?.let {
//        it.age
//    }
//    println(age)
//
//    //2. run
//    //수신객체.run {
//    //
//    // 마지막 줄
//    //}
//    val kid = User("아이", 4, false)
//    val kidAge = kid.run {
//        age
//    }
//    println(kidAge)
//    //3. apply
//    //수신객체.apply {
//    //  ddwfewfew
//    //}
//    // return 값이 수신객체
//    val female = User("슬기", 20, true, true)
//    val femaleValue = female.apply {
//        hasGlasses = false
//    }
//    println(femaleValue.hasGlasses)
//    //4. also
//    // 수신객체.also { it -> // local variable
//    //
//    //
//    // } // return 수신객체 (자기자신)
//
//    val male = User("민수", 17, false, true)
//    val maleValue = male.also {
//        println(it.name)
//    }
//    //5. with
//    // with(수신객체) {
//    //  ---
//    // 마지막줄
//    // }
//    val result = with(male) {
//        hasGlasses = false
//        true
//    }
//}
//
//class User(
//    val name : String,
//    val age: Int,
//    val gender : Boolean, // true : female, false : male
//    var hasGlasses : Boolean = true,
//)
//    lateinit var text : String
//    val test : Int by lazy {
//        println("초기화 중")
//        100
//    }
//
//    fun main() {
//        text = "안녕하세요"
//        println("메인 함수 실행")
//        println("초기화 한 값 $test")
//        println("두번째 호출 $test")
//    }
//    fun main() {
//        val person = Person("수지", 24)
//        val dog = Dog("해피", 24)
//
//        println(person.toString())
//        println(dog.toString())
//        println(dog.copy(age = 3).toString())
//
//        val cat: Cat = BlueCat()
//        val result = when(cat) {
//            is BlueCat ->  "blue"
//            is RedCat -> "red"
//            is GreenCat -> "green"
//            is WhiteCat -> "white"
//        }
//
//        println(result)
//    }
//    class Person(
//        val name : String,
//        val age: Int,
//    )
//
//    data class Dog(
//        val name: String,
//        val age: Int,
//    )
//
//    //sealed class
//    sealed class Cat
//    class BlueCat : Cat()
//    class RedCat : Cat()
//    class GreenCat : Cat()
//    class WhiteCat : Cat()
//    fun main() {
//
//        println(Counter.count)
//
//        Counter.countUp()
//        Counter.countUp()
//
//        println(Counter.count)
//
//        Counter.hello()
//
//        NAME
//    }
//
//    object Counter : Hello() {
//        init {
//            println("카운터 초기화")
//        }
//        var count = 0
//        fun countUp() {
//            count++
//        }
//    }
//
//    open class Hello() {
//        fun hello() = println("Hello")
//    }
//
//    class Book {
//        companion object Novel {
//            const val NAME = "name"
//            fun create() = Book()
//        }
//    }