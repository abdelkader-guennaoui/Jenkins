package junitguennaouiabdelkaderr;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class TestEvalRecherchePrenom {
	
	@DisplayName(value = "test1 - Kader")
	@Test
	void test1GetRecherchePrenom() {
		
		String prenom= "kader";
		String [] liste = {"mich", "kader", "kader"};		 		
		assertequals("kader", Arrays.toString(recherche(liste, prenom)));
	}
	private void assertequals(String string, String string2) {
		
		
	}
	private long[] recherche(String[] liste, String prenom) {
		
		return null;
	}
}