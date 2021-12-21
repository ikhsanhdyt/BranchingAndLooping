import java.lang.NumberFormatException

class BranchApp {
    var studentScore: Int = 0
    fun run() {
        printHeader()
        inputStudentScore()
        checkStudentScore(studentScore)
    }

    fun printHeader() {
        println("=====================")
        println("Student Exam Score Checker")
        println("=====================")
    }

    fun inputStudentScore() {
        println("Enter Student Score = ")
        studentScore = try {
            readLine()?.toInt() ?:0
        }catch (e: NumberFormatException){
            0
        }
    }

    fun checkStudentScore(studentScore: Int) {
        if (studentScore < 0 || studentScore > 100) {
            println("Input Failed, Please re Input")
            inputStudentScore()
            checkStudentScore(this.studentScore)
        }else if (studentScore > 75) {
            println("Student Pass")
        }else{
            println("Student Failed")
        }
    }
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val branchApp = BranchApp()
            branchApp.run()
        }
    }
}