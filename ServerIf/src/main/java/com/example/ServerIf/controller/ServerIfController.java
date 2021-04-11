package com.example.ServerIf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ServerIf.domain.ServerIf;
import com.example.ServerIf.service.ServerIfService;

@Controller
public class ServerIfController {

	
	 	@Autowired
	    private ServerIfService service;

	    @GetMapping("/")
	    public String viewHomePage(Model model, @ModelAttribute("mapping1Form") final String list2) {
	        List<ServerIf> list1 = service.listAll();
	        model.addAttribute("list1", list1);
	        model.addAttribute("list2", list2);
	        
	        System.out.print("Get / ");	
	        return "index";
	    }

	    @GetMapping("/new")
	    public String add(Model model) {
	        model.addAttribute("object", new ServerIf());
	        return "new";
	    }

	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveObject(@ModelAttribute("mapping1Form") String list2, @ModelAttribute("object") ServerIf std, Model model, final RedirectAttributes redirectAttributes) {
	        List<ServerIf> temp = service.findUserid(std.getUserid());
	        list2 = "second";
	        if(temp == null)
	        {
	        	list2 = "first";
	        	redirectAttributes.addFlashAttribute("list2", list2);
	        	
	        }
	        service.save(std);
	        System.out.println(std.getUserid());
	        
	        return "redirect:/";
	    }

	
	
	
}
