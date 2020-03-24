package com.nani.junittask1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.nani.tddjunit.RemoveCharacters;

class RemoveCharactersTest {
	@Test
	void removechars() {
		RemoveCharacters rc = new RemoveCharacters();
		String actual = rc.remove("ABCD");
		assertEquals("BCD",actual);
		//fail("Not yet implemented");
	}
	@Test
	void removechars2() {
		 RemoveCharacters rc=new RemoveCharacters();
	    	
		String actual = rc.remove("AACD");
		assertEquals("CD",actual);
		//fail("Not yet implemented");
	}
	@Test
	void removechars3() {
		 RemoveCharacters rc=new RemoveCharacters();
	    	
		String actual = rc.remove("BACD");
		assertEquals("BCD",actual);
		//fail("Not yet implemented");
	}
	@Test
	void removechars4() {
		 RemoveCharacters rc=new RemoveCharacters();
	    	
		String actual = rc.remove("BBAA");
		assertEquals("BBAA",actual);
		//fail("Not yet implemented");
	}
	@Test
	void removechars5() {
		 RemoveCharacters rc=new RemoveCharacters();
	    	
		String actual = rc.remove("AABAA");
		assertEquals("BAA",actual);
		//fail("Not yet implemented");
	}
	


}
