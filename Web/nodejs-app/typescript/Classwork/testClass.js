var Customer = /** @class */ (function () {
    function Customer(id, fisrtName, lastName) {
        this._id = id;
        this._firstName = fisrtName;
        this._lastName = lastName;
    }
    Object.defineProperty(Customer.prototype, "Id", {
        get: function () {
            return this._id;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Customer.prototype, "FirstName", {
        get: function () {
            return this._firstName;
        },
        set: function (name) {
            this._firstName = name;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Customer.prototype, "LastName", {
        get: function () {
            return this._lastName;
        },
        set: function (name) {
            this._lastName = name;
        },
        enumerable: true,
        configurable: true
    });
    return Customer;
}());
var c1 = new Customer(101, "Sachin", "Tendulakar");
console.log(c1.Id);
console.log(c1.FirstName);
console.log(c1.LastName);
c1.FirstName = "Virat";
console.log(c1.FirstName);
