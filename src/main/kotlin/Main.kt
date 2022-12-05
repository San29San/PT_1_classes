fun main() {

        // объект hippo
        val hippo = CabbageLover()
        hippo.animalKind= "Hippo"
        hippo.color = "grey"
        hippo.tail = "short"

        // объект hare
        val hare = CabbageLover()
        hare.animalKind= "Hare"
        hare.color = "white"
        hare.ears = "long"

        // объект fox
        val fox = MouseLover()
        fox.animalKind = "Fox"
        fox.color = "redhead"
        fox.tail = " furry "

        // объект puma
        val puma = MouseLover()
        puma.animalKind = "Puma"
        puma.color = "black"
        puma.teeth = "toothy"

        // список объектов
        val animalList = listOf<Animal>(hippo, hare, fox, puma)

        // вывод свойств объектов
        println()
        for (ani in animalList) {
                ani.printAll()
        }
}
