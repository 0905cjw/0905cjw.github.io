$(function(){
	$('#toggle').click(function(){
		if($('.header_menu').hasClass('active')==true){
			$('.header_menu').removeClass('active');
		}else{
			$('.header_menu').addClass('active');
		}
	});
	
	$('#menu>li').click(function(){
		$('.header_menu').removeClass('active');
	});
	
	var height=window.innerHeight;
	$('#home').css('height',height+'px');
	$('#home_txt').css('line-height',height+'px');
	$('#home>div').css('height', height+'px');
});
