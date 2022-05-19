fun main() {

    val outerInstance = OuterClassKotlin("first")
    // Please note the syntax differences to instantiate nested or inner class
    val nestedInstance = OuterClassKotlin.NestedClass()
    val innerInstance = outerInstance.InnerClass()
    val innerInstance2 = OuterClassKotlin("second").InnerClass()

    outerInstance.show()
    nestedInstance.show()
    innerInstance.show()
    innerInstance2.show()

}
