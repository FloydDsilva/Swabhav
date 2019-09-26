f1()

function f1() {
    setTimeout(() => {
        console.log("Inside F1")
    }, 2000)
    //console.log(window)
    console.log(global)
}