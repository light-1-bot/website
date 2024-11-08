document.getElementById("register-form").addEventListener("submit", function(event) {
    event.preventDefault(); // 防止表单提交的默认行为
    const username = document.getElementById("register-username").value;
    const password = document.getElementById("register-password").value;

    fetch("/register", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ username, password })
    })
        .then(response => response.text())
        .then(message => {
            document.getElementById("message").innerText = message;
        })
        .catch(error => {
            console.error("Error:", error);
        });
});

document.getElementById("login-form").addEventListener("submit", function(event) {
    event.preventDefault(); // 防止表单提交的默认行为
    const username = document.getElementById("login-username").value;
    const password = document.getElementById("login-password").value;

    fetch("/login", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ username, password })
    })
        .then(response => response.text())
        .then(message => {
            document.getElementById("message").innerText = message;
        })
        .catch(error => {
            console.error("Error:", error);
        });
});
