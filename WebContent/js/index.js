let login = document.getElementById("login")
let header = document.getElementById("navbarSupportedContent")
let form = document.getElementById("formLogin")
login.onclick = () => {
  let altura = form.style.top.substring(0, 2)
  form.style.top = (altura > 0 ? (-1 * form.offsetHeight) + "px" : (header.offsetHeight + 65) + "px")
}
$('.destaques').slick({
	arrows: false,
	centerMode: true,
	centerPadding: "10%",
  slidesToShow: 1,
  autoplay: false,
  autoplaySpeed: 2000
})
$('.maisvendidos').slick({
  infinite: true,
  slidesToShow: 3,
  slidesToScroll: 3,
  centerMode: true,
  variableWidth: false
})