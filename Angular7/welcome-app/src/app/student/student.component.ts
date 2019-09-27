import { Component } from "@angular/core";
import { IStudent } from "./IStudent";

@Component({
    selector: 'aurionpro-student',
    templateUrl: './student.component.html'
})

export class StudentComponent {
    student: IStudent
    imgWidth: number
    imgHeight: number
    students: IStudent[]

    constructor() {
        this.student = {
            rollNo: 1,
            cgpa: 7.5,
            name: "Sachin",
            photo: "../assets/download.jpg"
        }
        this.imgWidth = 200
        this.imgHeight = 300
    }

    convertCGPA = (cgpa: number) => {
        return (cgpa < 7) ? "red" : "green"
    }

    loadStudents = () => {
        this.students = [this.student, { rollNo: 2, cgpa: 6, name: "Ramesh", photo: "../assets/ca.jpg" }, { rollNo: 3, cgpa: 9, name: "Rinku", photo: "../assets/bw.jpg" }]
    }
}
