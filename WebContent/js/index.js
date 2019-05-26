let login = document.getElementById("login")
let header = document.getElementById("navbarSupportedContent")
let form =  document.getElementById("formulario")
login.onclick = () => {
    let altura = form.style.top.substring(0, 2)
    form.style.top = ( altura > 0 ? (-1 * form.offsetHeight)+"px" : "120px")
}
$('.destaques').slick({
    arrows: false,
    //dots: true,
    infinite: true,
    speed: 50,
    slidesToShow: 1,
    centerMode: true,
    variableWidth: true
  });
  $('.maisvendidos').slick({
	  infinite: true,
	  slidesToShow: 3,
	  slidesToScroll: 3
	});