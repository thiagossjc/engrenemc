package com.engrenelog.engrenemc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorys")
public class CategoryResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listing() {
		return "Rest está funcionando!";
	}

}
