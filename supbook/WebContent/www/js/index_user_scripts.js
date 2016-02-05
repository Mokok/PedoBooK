/*jshint browser:true */
/*global $ */(function()
{
 "use strict";
 /*
   hook up event handlers 
 */
 function register_event_handlers()
 {
    
    
        /* button  Login */
    $(document).on("click", ".uib_w_8", function(evt)
    {
         /*global activate_page */
         activate_page("#Profile"); 
    });
    
        /* button  #register_login */
    $(document).on("click", "#register_login", function(evt)
    {
         /*global activate_page */
         activate_page("#Register_forum"); 
    });
    
        /* button  Register */
    $(document).on("click", ".uib_w_20", function(evt)
    {
         /*global activate_page */
         activate_page("#Profile"); 
    });
    
    }
 document.addEventListener("app.Ready", register_event_handlers, false);
})();
