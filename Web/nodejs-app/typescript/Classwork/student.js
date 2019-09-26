"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Student = /** @class */ (function () {
    function Student(rollNo, name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    Object.defineProperty(Student.prototype, "RollNo", {
        get: function () {
            return this.rollNo;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "Name", {
        get: function () {
            return this.name;
        },
        enumerable: true,
        configurable: true
    });
    return Student;
}());
exports.Student = Student;
var Address = /** @class */ (function () {
    function Address(city) {
        this.city = city;
    }
    Object.defineProperty(Address.prototype, "City", {
        get: function () {
            return this.city;
        },
        enumerable: true,
        configurable: true
    });
    return Address;
}());
exports.Address = Address;
