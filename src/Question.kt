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
class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)
fun main(){
    val question = Question(
        "речка спятила с ума по домам  пошла сама",
        "водопад",
        "medium"
    )
    val question2 = Question(
        "небо зеленое правда или ложт",
        false,
        "easy"
    )
    val question3 = Question(
        "сколько дней между плнолуниями",
        28,
        "hard"
    )
    println(question.answer)
    println(question2.answer)
    println(question3.answer)

}