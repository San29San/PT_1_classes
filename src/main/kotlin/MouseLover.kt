//  подкласс плотоядных, с дополнительным свойством teeth
class MouseLover: Animal() {
    var teeth = "sharp"


    override fun printAll(){
        println ("animaKind: $animalKind, tail: $tail, color: $color, teeth: $teeth, teeth: $teeth")
    }
}