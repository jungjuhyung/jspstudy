package com.ict.model.guestbook2;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WriteCommand implements Command {
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		return "guestbook2/write.jsp";
	}
}