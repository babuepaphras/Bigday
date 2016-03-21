ACC.login = {

	bindAll: function()
	{
		
		this.bindloginLink($('.login-user'));
	},

	bindloginLink: function(link)
	{
		
		link.click(function()
		{
			
		$.get(link.data('url')).done(function(data) {
			
				$.colorbox({
					html: data,
					width:700,
					height: false,
					overlayClose: false,
					onOpen: function()
					{
					//	alert("rao");
						$('#validEmail').remove();
					},
					onComplete: function()
					{
						var loginForm = $('#loginForm');
						loginForm.ajaxForm({
							success: function(data)
							{
							/*	if ($(data).closest('#validEmail').length)
								{*/
									
									/*if ($('#validEmail').length === 0)
									{*/
										$('#globalMessages').append(data);
									/*}*/
									$.colorbox.close();
								/*}
								else
								{
							
									$("#registerForm .control-group").replaceWith($(data).find('.control-group'));
									$.colorbox.resize();
								}*/
							}
						});
						ACC.common.refreshScreenReaderBuffer();
					},
					onClosed: function()
					{
						ACC.common.refreshScreenReaderBuffer();
					}
				});
			});
		});
	}
};


$(document).ready(function()
{
	
	ACC.login.bindAll();
});
