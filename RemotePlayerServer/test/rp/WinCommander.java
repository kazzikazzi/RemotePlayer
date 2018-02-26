package rp;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class WinCommander {

	@Test
	public void test() throws IOException {
		String command = "\"c:/Program Files (x86)/Winamp/Winamp.exe\"";
		String params = "\"c:/test\"";
		
		Runtime.getRuntime().exec(new String[]{command, params} );
		System.out.println("ejecutado!");
		
		//fail("Not yet implemented");
		
	}

}
