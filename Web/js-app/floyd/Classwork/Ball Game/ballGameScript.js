    (function () {
        var playButton = document.getElementById('playButton')
        playButton.addEventListener('click', playGame)

        function playGame() {
            document.getElementById('mainArea').innerHTML = ""
            var mainArea = document.getElementById('mainArea')
            var random = Math.floor(Math.random() * 50) + 1
            random = 20
            var attempt = 0
            var attemptText = document.createTextNode("")
            var pTag = document.createElement("P")
            pTag.id = "attemptValue"
            pTag.appendChild(attemptText)
            mainArea.appendChild(pTag)
            for (var i = 1; i <= 50; i++) {
                var btn = document.createElement("BUTTON")
                //btn.innerHTML = i
                btn.value = i
                mainArea.appendChild(btn)
                btn.addEventListener('click', function () {
                    attempt += 1
                    document.getElementById("attemptValue").innerHTML = "Attempt=" + attempt
                    if (attempt <= 3) {

                        if (this.value == random) {
                            this.style.background = "Blue"
                            console.log(this.value, random)
                            var elements = mainArea.querySelectorAll('button')
                            for (var i = 0; i < elements.length; i++) {
                                elements[i].disabled = true
                            }
                            setInterval(() => {
                                restart("You Won!")
                            }, 1000)

                        } else if (this.value >= random) {
                            this.style.background = "Green"
                            console.log(this.value, random)
                            if (attempt >= 3) {
                                setInterval(() => {
                                    restart("You Lost!")
                                }, 1000)
                            }
                        } else {
                            this.style.background = "Red"
                            console.log(this.value, random)
                            if (attempt >= 3) {
                                setInterval(() => {
                                    restart("You Lost!")
                                }, 1000)
                            }
                        }
                    }
                })
            }

        }

        function restart(result) {

            retVal = confirm(result + " Do you want to continue ?");
            if (retVal) {
                location.reload()
            }


        }
    })()