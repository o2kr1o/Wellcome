console.log(1);
const works = document.querySelectorAll(".works"); 
console.log(works[0].children);

for (i=0 ; i < 5 ; i++) {
  console.log(works[0].children[i]);
  works[0].children[i].addEventListener("click", clickH);
}

function clickH(e) {
  console.log(e);
  e.srcElement.classList.toggle("onClick")
}

particlesJS.load('particles-js', 'assets/js/particles.json', function() {
  console.log('callback - particles.js config loaded');
});
