//  подкласс травоядных с дополнительным свойством ears
class CabbageLover: Animal() {
    var ears = "long"


    override fun printAll(){
        println ("animaKind: $animalKind, tail: $tail, color: $color, ears: $ears")
    }
}