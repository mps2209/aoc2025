package main.day1

class Safe(){
    var position = 50
    var combination = 0
    fun rotate(direction: Char, rotation: Int) {
        if (direction == 'L') {
            combination+=(100-position+rotation)/100
            if (position==0){
                combination--
            }
            position = (position - rotation) % 100
            if (position<0){
                position+=100
            }
        } else {
            combination+=(position+rotation)/100
            position = (position + rotation) % 100
        }

    }
}
