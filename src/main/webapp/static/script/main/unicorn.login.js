/**
 * Unicorn Admin Template
 * Diablo9983 -> diablo9983@gmail.com
**/
$(document).ready(function(){

	var login = $('#loginform');
	var recover = $('#recoverform');
    //用户名
    var usernameElement = $("input[name='userName']");
    var passwordElement = $("input[name='password']");
	var speed = 400;

	$('#to-recover').click(function(){
		login.fadeTo(speed,0.01).css('z-index','100');
		recover.fadeTo(speed,1).css('z-index','200');
	});

	$('#to-login').click(function(){
		recover.fadeTo(speed,0.01).css('z-index','100');
		login.fadeTo(speed,1).css('z-index','200');
	});

    login.submit(function(){
       if(usernameElement.val().trim()&&passwordElement.val().trim()){
           return true;
       }
       if(!usernameElement.val().trim()){
           usernameElement.focus();
       }else{
           passwordElement.focus();
       }
        return false;
    });
    
    if($.browser.msie == true && $.browser.version.slice(0,3) < 10) {
        $('input[placeholder]').each(function(){ 
       
        var input = $(this);       
       
        $(input).val(input.attr('placeholder'));
               
        $(input).focus(function(){
             if (input.val() == input.attr('placeholder')) {
                 input.val('');
             }
        });
       
        $(input).blur(function(){
            if (input.val() == '' || input.val() == input.attr('placeholder')) {
                input.val(input.attr('placeholder'));
            }
        });
    });

        
        
    }
});