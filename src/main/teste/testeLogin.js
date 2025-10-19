const form = document.getElementById('loginForm');

form.addEventListener('submit', async function(event) {
    event.preventDefault();

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    try {

        const response = await fetch('http://localhost:8080/test/login', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ username, password })
        });

        if (response.ok) {
            const message = await response.text();
            window.location.href = "main.html";
        } else if (response.status === 401) {
            alert("Usuário ou senha inválidos!");
        } else {
            console.log("Erro desconhecido: " + response.status);
        }
    } catch (error) {
        console.log("Erro na conexão com o backend: " + error);
    }
});
