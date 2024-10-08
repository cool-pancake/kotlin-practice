package practice8

fun framesCount(minutes: Int, fps: Int): Int {
    return minutes * 60 * fps
}

fun main() {
    println(framesCount(1, 60))
}