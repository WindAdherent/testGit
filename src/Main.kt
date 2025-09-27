//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
    data class Person(val name: String, var age: Int)
    //尝试创建一个类
    data class Address(val street: String, var region: Int)
    data class Company(val id: Person, val live: Address)
    val people1 = Person("Dmitry", 28)
    val address1 = Address("Dayuncun", 29)
    
    val comployee = Company(people1, address1)
    println(comployee.id.name)
    println(comployee.live.street)

    val people2 = Person("Haoer", 24)
    val address2 = Address("Xiabeize", 114514)

    val comployee2 = Company(people2, address2)

    val sheet: Array<Company> = arrayOf(
        comployee,
        comployee2
    )

    println(sheet.joinToString("\n"))

}