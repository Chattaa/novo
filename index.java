const valorInicial = 346896000;
let segundos = parseInt(localStorage.getItem('contadorSegundos')) || valorInicial;

localStorage.setItem('contadorSegundos', segundos);

const contador = document.getElementById('contador');
contador.textContent = segundos;

setInterval(() => {
  segundos++;
  contador.textContent = segundos;
  localStorage.setItem('contadorSegundos', segundos);
}, 1000);
