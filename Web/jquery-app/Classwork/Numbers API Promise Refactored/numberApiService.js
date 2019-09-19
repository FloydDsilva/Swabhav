var NumberApi = function () {
    var service = {}
    var facts = []
    service.getFacts = function (no) {
        return new Promise(function (resolve, reject) {
            $.ajax({
                type: "GET",
                url: "http://numbersapi.com/" + (no),
                dataType: "text",
                success: function (data) {
                    resolve(data)
                    facts = (localStorage.getItem('facts')) ? (JSON.parse(localStorage.getItem('facts'))) : []
                    facts.push(data);
                    localStorage.setItem("facts", JSON.stringify(facts))
                },
                error: function () {
                    reject("Data not Found")
                }
            })
        })
    }

    service.getPreviousFacts = function () {
        facts =(JSON.parse(localStorage.getItem('facts')))
        return facts
    }

    return service
}()