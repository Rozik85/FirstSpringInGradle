package com.sda.springstarter.demo.config;

import com.sda.springstarter.demo.model.User;
import com.sda.springstarter.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class LoginController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = {"/","/login"}, method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView registration(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", new User());
        modelAndView.setViewName("registration");
        return modelAndView;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView storeUser(@Valid User user, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();
        User userExist= userService.findByEmail(user.getEmail());
        if(userExist !=null){
            bindingResult.rejectValue("email",
                    "error.user",
                    "Email jest już zajety");
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("registration");
        }else {
            userService.saveUser(user);
            modelAndView.addObject("successMessage", "zarejestrowales sie");
        }
        return modelAndView;
    }
    @RequestMapping(value = "/admin/home",method = RequestMethod.GET)
    public  ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findByEmail(authentication.getName());
        modelAndView.addObject("userName", "Witaj: "+user.getEmail());

        modelAndView.setViewName("admin/home");
        return modelAndView;
    }

}