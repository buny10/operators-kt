//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {
     var x=5
    val y=3

//here we are doing operations
    /*
    okokokokokokokok
    okokokokokokok
     */
     println("result = ${x+y}")
     println("result = ${x*y}")
     println("result = ${x-y}")
     println("result = ${x/y}")
     println("result = ${x+y}")
     println("result = ${x+y}")
     println("result = ${x+y}")

    var result = x+y

    result = result + 2
    println("result = $result")

    println("3+3*4 = ${(3+3*4)}")

    x = 0
    println("x= ${x++}")
    println("x=${++x}")

    println("x = ${x--}")
    println("x = ${--x}")

    val active = false
    if (active == true) {
        println("the user is active ")
    }
    else {
        println("the user is not active ")
    }

    val a = 133
    if (a > 140) {
        println("its ok")
    }
    else if (a <= 140) {
        println("its not ok")
    }else if (a !=100){
        println("terminate")

    }else{
        println("done")
    }

    val num1 = 5
    val num2 = 4
    val text = if (num1 > 1 || num2 <6)

   " this is text 1"


    else
    "this is text 2"
     println("$text")







}