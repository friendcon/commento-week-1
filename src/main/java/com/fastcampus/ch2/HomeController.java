package com.fastcampus.ch2;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.practice.commento.domain.MovieVO;
import com.practice.commento.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

@Controller
public class HomeController {
	@Inject
	private MovieService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) throws Exception {

		List<MovieVO> movieList = service.selectMovie();

		model.addAttribute("movieList", movieList);

		return "index";
	}
	
}
