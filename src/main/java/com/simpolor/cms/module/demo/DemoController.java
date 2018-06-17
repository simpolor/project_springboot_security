package com.simpolor.cms.module.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.simpolor.cms.module.demo.domain.Demo;
import com.simpolor.cms.module.demo.service.DemoService;

@Controller
public class DemoController {

	@Autowired
	private DemoService demoService;

	@RequestMapping("/demo")
	public String demo() {
		
		System.out.println("demo count : "+demoService.findAllCount());
		
		Demo demo = demoService.findByDemo(1);
		if(demo != null) {
			System.out.println("seq : "+demo.getSeq());
			System.out.println("name : "+demo.getName());
			System.out.println("age : "+demo.getAge());
			System.out.println("hobby : "+demo.getHobby());
		}
		
		return "module/demo/demo";
	}
	
	@RequestMapping("/demo/{seq}")
	public ModelAndView demo(@PathVariable int seq) {
		
		ModelAndView mav = new ModelAndView();
		
		Demo demo = demoService.findByDemo(seq);
		if(demo != null) {
			System.out.println("seq : "+demo.getSeq());
			System.out.println("name : "+demo.getName());
			System.out.println("age : "+demo.getAge());
			System.out.println("hobby : "+demo.getHobby());
			mav.addObject("demo", demo);
		}
		
		mav.setViewName("module/demo/demo");
		
		return mav;
	}
	
	@RequestMapping("/demo1")
	public String demo1() {
		
		System.out.println("demo count : "+demoService.findAllCount());
		
		Demo demo = demoService.findByDemo(1);
		if(demo != null) {
			System.out.println("seq : "+demo.getSeq());
			System.out.println("name : "+demo.getName());
			System.out.println("age : "+demo.getAge());
			System.out.println("hobby : "+demo.getHobby());
		}
		
		return "module/demo/demo";
	}
	
	@RequestMapping("/demo2")
	public String demo2() {
		
		System.out.println("demo count : "+demoService.findAllCount());
		
		Demo demo = demoService.findByDemo(1);
		if(demo != null) {
			System.out.println("seq : "+demo.getSeq());
			System.out.println("name : "+demo.getName());
			System.out.println("age : "+demo.getAge());
			System.out.println("hobby : "+demo.getHobby());
		}
		
		return "module/demo/demo";
	}
	
}
