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
fun main(){
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
    println(question.toString())
    println(question2.answer)
    println(question3.answer)

}