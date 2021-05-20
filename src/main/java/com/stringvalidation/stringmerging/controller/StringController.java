package com.stringvalidation.stringmerging.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stringvalidation.stringmerging.model.Form;

import jdk.jfr.internal.Logger;

@Controller
public class StringController {

	@RequestMapping({ "/" })
	public String welcomForm(@Validated @ModelAttribute("formModel") Form form, Model model) {

		return "form";
	}

	@PostMapping({ "/validate" })
	public String submitForm(@Validated @ModelAttribute("formModel") Form form, Model model) {

		int pointer1 = 0;
		int pointer2 = 0;

		StringBuffer resultString = new StringBuffer();
		String s1 = form.getString1();
		String s2 = form.getString2();

		try {

			if (s1.isEmpty() && s2.isEmpty())
				throw new NullPointerException("The Input String is Null");

			while (pointer1 < s1.length() || pointer2 < s2.length()) {

				if (pointer1 < s1.length()) {
					resultString = resultString.append(String.valueOf(s1.charAt(pointer1)));
					pointer1++;
				}

				if (pointer2 < s2.length()) {
					resultString = resultString.append(String.valueOf(s2.charAt(pointer2)));
					pointer2++;
				}

			}
		} catch (NullPointerException e) {
			model.addAttribute("error", e.getMessage());
			return "error";
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
			return "error";
		}

		model.addAttribute("resultString", resultString);
		return "success";
	}

}
