import org.w3c.dom.Text

class FillInBlankQuestion(
    val questionText: String,
    val answer: String,
    val difficulty: String
)
class TrueOrFalseQuestion(
    val questionText: String,
    val answer: Boolean,
    val difficulty: String
)
class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
)
data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
enum class Difficulty{
    EASY,
    MEDIUM,
    HARD
}
object  StudentProgress{
    var total : Int = 10
    var answered : Int = 3
}
interface ProgressPrintable{
    val progressText : String
    fun printProgressBar()
}
class Quiz : ProgressPrintable{
    override val progressText: String
        get() = "${answered} of ${total} answered"

    override fun printProgressBar() {
        repeat(Quiz.answered){ print("▓")}
        repeat(Quiz.total - Quiz.answered){ print("▒")}
        println()
        println(progressText)
    }
    val question = Question(
        "речка спятила с ума по домам  пошла сама",
        "водопад",
        Difficulty.MEDIUM
    )
    val question2 = Question(
        "небо зеленое правда или ложт",
        false,
        Difficulty.EASY
    )
    val question3 = Question(
        "сколько дней между плнолуниями",
        28,
        Difficulty.HARD
    )
    companion object StudentProgress{
        var total : Int = 10
        var answered : Int = 3
    }

}

fun main(){
//    println("${Quiz.answered} of ${Quiz.total} answered")
//    println(Quiz.progressText)
    Quiz().printProgressBar()

}