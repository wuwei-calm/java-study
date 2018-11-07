package com.test.framework.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 处理应用程序主页的请求
 */
@Controller
@RequestMapping("home")
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * 只需返回其名称即可选择要呈现的主页视图
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String formattedDate = formater.format(date);
		model.addAttribute("serverTime", formattedDate );
		return formattedDate;
	}
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String mvTest(String index){
		return index;
	}

	@RequestMapping(value="mv", method = RequestMethod.GET)
	public ModelAndView modelAndViewTest(String str){
		ModelAndView mv = new ModelAndView();
		mv.addObject("testVal","testModealAndView");
		mv.addObject("mv",str);
		mv.setViewName("viewTest");
		return mv;
	}

}
