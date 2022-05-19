class OuterClassKotlin(val name: String) {

    fun show() {
        println("OuterKotlin")
    }

    // In Kotlin nested classes by default have no reference to the outer class
    class NestedClass {
        fun show() {
            println("NestedKotlin")
        }
    }

    // In Kotlin to have a nested class keep a reference to the outer class you need to add the inner keyword
    inner class InnerClass {
        fun show() {
            println("InnerKotlin inside " + this@OuterClassKotlin.name)
        }
    }

}