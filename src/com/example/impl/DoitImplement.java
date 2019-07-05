package com.example.impl;
import com.example.DoitInterface;

public class DoitImplement implements DoitInterface {
	@Override
	public String process() {
		String msg = "in do process method";
		return msg;
	}
}