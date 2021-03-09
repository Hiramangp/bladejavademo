package com.shreeram.bladejavademo;

import java.time.LocalDateTime;
import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.http.Request;
import com.blade.mvc.ui.ModelAndView;
import com.blade.mvc.annotation.JSON;
import com.blade.mvc.ui.RestResponse;

@Path("/")
public class AppController {
    
    @GetRoute("/")
    public ModelAndView welcome(){
        ModelAndView mView = new ModelAndView("home.html");
        return mView;
    }
    
    @GetRoute("/hi")
    @JSON
    public RestResponse<Object> hi(Request req){
        return RestResponse.ok(LocalDateTime.now().toString());
    }
}
