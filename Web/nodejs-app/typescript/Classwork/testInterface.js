function printInfo(customers) {
    for (var _i = 0, customers_1 = customers; _i < customers_1.length; _i++) {
        var c = customers_1[_i];
        console.log(c);
    }
}
printInfo([
    { id: 101, firstName: "Sachin", lastName: "Tendulkar" },
    { id: 102, firstName: "Virat", lastName: "Kohli" },
    { id: 103, firstName: "Kapil", lastName: "Dev" }
]);
