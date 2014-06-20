package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {

	@Autowired
	private SpellChecker spellChecker;
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
