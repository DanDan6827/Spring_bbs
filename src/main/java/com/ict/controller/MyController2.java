package com.ict.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController2 {
	@RequestMapping("login.do")
	public ModelAndView loginCommand() {
		return new ModelAndView("login");
	}
	@RequestMapping("write.do")
	public ModelAndView writeCommand() {
		return new ModelAndView("write");
		
	}
	@RequestMapping("logout.do")
	public ModelAndView logoutCommand(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("redirect:list.do");
		request.getSession().invalidate();
		return mv;
		
	}
	@RequestMapping("download.do")
	public void downCommand(
			@RequestParam("file_name")String file_name,HttpServletRequest request, HttpServletResponse response
			) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			String path = request.getSession().getServletContext().getRealPath("/resources/upload/"+file_name);
			response.setContentType("application/x-msdownload");
			response.setHeader("Content-Disposition", "attachment; filename="+URLEncoder.encode(file_name,"utf-8"));
			File file = new File(new String(path.getBytes("utf-8")));
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(response.getOutputStream());
			
			FileCopyUtils.copy(bis, bos);
		} catch (Exception e) {
		}finally {
			try {
				bos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
	@RequestMapping(value = "delete.do",method = RequestMethod.POST)
	public ModelAndView DeleteCommand(@ModelAttribute("cPage")String cPage) {
		return new ModelAndView("delete");
	}
	@RequestMapping("update.do")
	public ModelAndView updateCommand(@ModelAttribute("cPage")String cPage) {
		return new ModelAndView("update");
	}
}
