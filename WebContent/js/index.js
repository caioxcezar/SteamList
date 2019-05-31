let login = document.getElementById("login")
let header = document.getElementById("navbarSupportedContent")
let form = document.getElementById("formLogin")
login.onclick = () => {
  let altura = form.style.top.substring(0, 2)
  form.style.top = (altura > 0 ? (-1 * form.offsetHeight) + "px" : "65px")
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
  variableWidth: false,
  responsive: [
	    {
	      breakpoint: 1024,
	      settings: {
	        slidesToShow: 3,
	        slidesToScroll: 3,
	        infinite: true,
	        dots: true
	      }
	    },
	    {
	      breakpoint: 600,
	      settings: {
	        slidesToShow: 2,
	        slidesToScroll: 2
	      }
	    },
	    {
	      breakpoint: 480,
	      settings: {
	        slidesToShow: 1,
	        slidesToScroll: 1
	      }
	    }
	    ]
})
$('.carouselJogo').slick({
	autoplay: true,
	autoplaySpeed: 2000,
	infinite: true,
	arrows: false,
	dots: false,
	pauseOnFocus: false
})