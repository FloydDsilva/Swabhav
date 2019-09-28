export class QuestionService{ 
    questions:String[]
    get Questions() {
        return this.questions = ["Q1 This is question 1", "Q2 This is question 2", "Q3 This is question 3", "Q4 This is question 4", "Q5 This is question 5"]
    }
}