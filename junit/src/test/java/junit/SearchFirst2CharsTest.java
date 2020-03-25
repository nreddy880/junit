package junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SearchFirst2CharsTest {
	 {
			/*TO DO LIST
			 * 1. 1 char: A => ""     --SUCCESS
			 * 2. 1 char: B => B      --SUCCESS 
			 * 3.2 chars: AB => B     --SUCCESS
			 * 4.2 chars: BB => BB    --SUCCESS
			 * 4.empty char: "" => "" --SUCCESS
			 * 5.n chars: ABC => BC   --SUCCESS
			 * 6.n chars: BCD => BCD  --SUCCESS
			 */
			SearchFirst2Chars searchFirst2Chars;
			
			@BeforeEach
			void setup() {
				searchFirst2Chars=new SearchFirst2Chars();
			}

			@Test
			void test1charA(){
				assertEquals("",searchFirst2Chars.removeA("A"));
			}
			
			@Test
		    void test1CharB(){
		    	assertEquals("B",searchFirst2Chars.removeA("B"));
		    }
			
			@Test
			void test2CharsAB(){
		    	assertEquals("B",searchFirst2Chars.removeA("AB"));
		    }
			
			@Test
			void test2CharsBB(){
		    	assertEquals("BB",searchFirst2Chars.removeA("BB"));
		    }
			
			@Test
			void testEmptyChar(){
		    	assertEquals("",searchFirst2Chars.removeA(""));
		    }
			
			@Test
			void testnCharsABC(){
		    	assertEquals("BC",searchFirst2Chars.removeA("ABC"));
		    }
			
			@Test
			void testnCharsBCD(){
		    	assertEquals("BCD",searchFirst2Chars.removeA("BCD"));
		    }
			
}
