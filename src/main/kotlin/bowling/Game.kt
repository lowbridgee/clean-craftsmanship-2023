package bowling

class Game {
    private var rolls = mutableListOf<Int>()
    private var currentRoll = 0
    fun roll(pins: Int) {
        rolls.add(pins)
        currentRoll++
    }

    fun score(): Int {
        var score = 0
        var frameIndex = 0
        for (frame in 1..10) {
            if (isStrike(frameIndex)) {
                score += 10 + rolls[frameIndex+1] + rolls[frameIndex+2]
                frameIndex++
            }
            else if (isSpare(frameIndex)) {
                score += 10 + rolls[frameIndex+2]
                frameIndex += 2
            } else {
                score += rolls[frameIndex] + rolls[frameIndex+1]
                frameIndex += 2
            }
        }
        return score
    }

    private fun isSpare(frameIndex: Int): Boolean {
        return rolls[frameIndex] + rolls[frameIndex+1] == 10
    }

    private fun isStrike(frameIndex: Int): Boolean {
        return rolls[frameIndex] == 10
    }
}
