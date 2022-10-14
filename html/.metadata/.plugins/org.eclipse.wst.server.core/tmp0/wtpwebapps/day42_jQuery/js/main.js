/** main.js */

$(function() {
	
	$('#demo .inner').click(function(){
		// 선택자.animate( {속성:값, 속성:값,.... },  시간, 이징, 다른할일);
		//$(this).animate({opacity: 0,  fontSize:'0px'}, 1500);
		// 이징 : linear, swing 
		$(this).animate({opacity: 0,  fontSize:'0px'}, 1500, 'linear');
		$(this).animate({opacity:0, fontSize:'0px'}, 1500, 'easeInOutCubic', function(){
			$(this).animate({opacity:1, fontSize:'1.5em'})
		});
	});

	$(' input[type="button"] ').on('click', function(e) {
		let $target = $(e.target);
		switch ($target.attr('id')) {
			case 'fadeout': $('#target').fadeOut('slow'); break;
			case 'hide': $('#target').hide(); break;
			case 'show': $('#target').show(); break;
			case 'fadein': $('#target').hide().fadeIn(3000); break;
			case 'slidedown': $('#target').hide().slideDown('slow'); break;
			case 'slideup': $('#target').slideUp('slow'); break;
			case 'mix': $('#target').fadeOut('slow')
				.fadeIn('slow').delay(1000).slideUp()
				.slideDown('slow', function() {
					alert('마칩니다!!!')
				});
				break;
		} // swtich end
	}); //  ' input[type="button"] ' end



	$('#run').on('click', function() {
		$('#target').animate({
			width: "300px",
			opacity: 0.4,
			marginLeft: "50px",
			fontSize: "30px",
			borderWidth: "10px",
			borderColor: "red",
			transition: "border-width  0.6s  swing"
		}, 3000);
	});
});
